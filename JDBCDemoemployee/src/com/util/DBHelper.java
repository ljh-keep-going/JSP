package com.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Properties;

public class DBHelper {
	//驱动类型
	private String driver = null;
	//连接URL（IP地址，端口号，数据库名，字符编码，时区等信息）
	private String url = null;
	//数据库服务器的用户名
	private String username = null;
	//数据库服务器的密码
	private String password = null;
	//连接对象
	private Connection connection = null;
	//常规化执行对象
	private Statement statement = null;
	//参数化的执行对象
	private PreparedStatement preparedStatement = null;
	//过程函数化的执行对象
	private CallableStatement callableStatement = null;
	//结果集对象
	private ResultSet resultSet = null;
	private static DBHelper dbHelper = new DBHelper();
	//私有的构造函数，确保外界不能实例化该类
	private DBHelper(){
		Properties properties = CommUtils.loadProperties("db.properties");
		driver = properties.getProperty("jdbc.driver");
		url = properties.getProperty("jdbc.url");
		username = properties.getProperty("jdbc.username");
		password = properties.getProperty("jdbc.password");
	}
	public static DBHelper getInstance(){
		return dbHelper;
	}
	//创建连接
	public void createConnection(){
		try {
			//装载JDBC驱动
			Class.forName(driver);
			//通过驱动管理器获取连接
			connection = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//关闭连接
	public void closeAllObject(){
		try {
			if(resultSet != null)
				resultSet.close();
			if(statement != null)
				statement.close();
			if(preparedStatement != null)
				preparedStatement.close();
			if(callableStatement != null)
				callableStatement.close();
			if(connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//常规化执行对象关于select操作
	public ResultSet executeQueryForStatement(String strSql){
		this.createConnection();
		try {
			this.statement = this.connection.createStatement();
			this.resultSet = this.statement.executeQuery(strSql);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return this.resultSet;
	}
	//常规化执行对象关于insert、update、delete操作
	public int executeUpdateForStatement(String strSql){
		this.createConnection();
		try {
			this.statement = this.connection.createStatement();
			return this.statement.executeUpdate(strSql);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally{
			this.closeAllObject();
		}
	}
	//参数化执行对象关于select操作
	public ResultSet executeQueryForPreparedStatement(String strSql,Object... sqlParams){
		this.createConnection();
		try {
			this.preparedStatement = this.connection.prepareStatement(strSql);
			if(sqlParams != null){
				for(int i=0;i<sqlParams.length;i++){
					this.preparedStatement.setObject(i+1, sqlParams[i]);
				}
			}
			this.resultSet = this.preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return this.resultSet;
	}
	//参数化执行对象关于insert、update、delete操作
	public int executeUpdateForPreparedStatement(String strSql,Object... sqlParams){
		this.createConnection();
		try {
			this.preparedStatement = this.connection.prepareStatement(strSql);
			if(sqlParams != null){
				for(int i=0;i<sqlParams.length;i++){
					this.preparedStatement.setObject(i+1, sqlParams[i]);
				}
			}
			return this.preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally{
			this.closeAllObject();
		}
	}
	//过程函数化执行对象关于select操作
	public ResultSet executeQueryForCallableStatement(String strSql,Object[] sqlParams){
		this.createConnection();
		try {
			this.callableStatement = this.connection.prepareCall(strSql);
			if(sqlParams != null){
				for(int i=0;i<sqlParams.length;i++){
					this.callableStatement.setObject(i+1, sqlParams[i]);
				}
			}
			this.resultSet = this.callableStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return this.resultSet;
	}
	//过程函数化执行对象关于insert、update、delete操作
	public int executeUpdateForCallableStatement(String strSql,Object[] sqlParams,int index){
		this.createConnection();
		try {
			this.callableStatement = this.connection.prepareCall(strSql);
			if(sqlParams != null){
				for(int i=0;i<sqlParams.length;i++){
					this.callableStatement.setObject(i+1, sqlParams[i]);
				}
			}
			this.callableStatement.executeUpdate();
			this.callableStatement.registerOutParameter(index, Types.INTEGER);
			return this.callableStatement.getInt(index);
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally{
			this.closeAllObject();
		}
	}
}
