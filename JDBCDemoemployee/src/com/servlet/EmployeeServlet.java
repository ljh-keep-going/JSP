package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Employee;
import com.entity.User;
import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method=request.getParameter("method");
		EmployeeService employeeService = new EmployeeServiceImpl();
		if(method.equals("add")) {//执行新增
			String employeeName=request.getParameter("employeeName");
			String employeeSex=request.getParameter("employeeSex");
			String employeeAge=request.getParameter("employeeAge");
			String employeeDept=request.getParameter("employeeDept");
			String employeepost=request.getParameter("employeepost");
			Integer employeeTel=Integer.parseInt(request.getParameter("employeeTel"));
			String employeeEmail=request.getParameter("employeeEmail");
			
			Employee employee=new Employee(employeeName,employeeSex,employeeAge,employeeDept,employeepost,employeeTel,employeeEmail);
			if(employeeService.saveEmployee(employee)>0) {//成功去列表请求拿到数据再到列表页employeeList.jap展示
				response.sendRedirect("EmployeeServlet?method=list");
			}else {//新增失败去新增页继续新增
				response.sendRedirect("employeeAdd.jsp");
			}
		}else if(method.equals("del")){//执行删除
			Integer employeeId=Integer.parseInt(request.getParameter("employeeId"));
			employeeService.delEmployee(employeeId);//删除之后去列表请求（list）拿到数据再到列表页employeeList.jap展示
			response.sendRedirect("EmployeeServlet?method=list");	
		}else if(method.equals("toUpdate")){//去修改页面，去修改页面之前获取要修改的年级原始数据
			Integer employeeId=Integer.parseInt(request.getParameter("employeeId"));
			request.setAttribute("employee", employeeService.getEmployeeById(employeeId));
			request.getRequestDispatcher("employeeUpdate.jsp").forward(request, response);;
		}else if(method.equals("update")){//执行修改
			Integer employeeId=Integer.parseInt(request.getParameter("employeeId"));
			String employeeName=request.getParameter("employeeName");
			String employeeSex=request.getParameter("employeeSex");
			String employeeAge=request.getParameter("employeeAge");
			String employeeDept=request.getParameter("employeeDept");
			String employeepost=request.getParameter("employeepost");
			Integer employeeTel=Integer.parseInt(request.getParameter("employeeTel"));
			String employeeEmail=request.getParameter("employeeEmail");
			Employee employee=new Employee(employeeId,employeeName,employeeSex,employeeAge,employeeDept,employeepost,employeeTel,employeeEmail);			if(employeeService.updateEmployee(employee)>0) {//成功去列表请求拿到数据再到列表页employeeList.jap展示
				response.sendRedirect("EmployeeServlet?method=list");
			}else {//修改失败去修改页继续操作修改
				response.sendRedirect("EmployeeServlet?method=toUpdate&employeeId"+employeeId);
			}
		}else if(method.equals("list")){//查询多个年级，去年级列表页面展示多个年级数据
			request.setAttribute("employeeList", employeeService.getEmployeeList());
			request.setAttribute("user", (User)(request.getSession().getAttribute("loginuser")));
			request.getRequestDispatcher("employeeList.jsp").forward(request, response);;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
