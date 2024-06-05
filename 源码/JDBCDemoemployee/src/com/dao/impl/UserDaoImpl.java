package com.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.UserDao;
import com.entity.User;
import com.sun.crypto.provider.RSACipher;
import com.util.DBHelper;

public class UserDaoImpl implements UserDao{
	private static DBHelper dbHelper = DBHelper.getInstance();

	@Override
	public User getUserByUserNamePass(User user) {
		String sql="SELECT `userId`,`userName`,`userType`\r\n" + 
				"FROM `user`\r\n" + 
				"WHERE `userName`=? AND `password`=? AND `userType`=?";
		User user1=null;
		try {
			ResultSet rs = dbHelper.executeQueryForPreparedStatement(sql, 
					user.getUserName(),user.getPassword(),user.getUserType());
			while(rs.next()) {
				user1=new User();
				user1.setUserId(rs.getInt("userId"));
				user1.setUserName(rs.getString("userName"));
				user1.setUserType(rs.getInt("userType"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			dbHelper.closeAllObject();//释放资源
		}
		return user1;
	}
	@Override
	public int save(User user) {
		String sql = "INSERT INTO `user`(`userName`,`password`,`userType`)\r\n" + 
				"VALUES(?,?,?)";
		return dbHelper.executeUpdateForPreparedStatement(sql, 
				user.getUserName(),user.getPassword(),user.getUserType());
	}

}
