package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Salary;
import com.entity.User;
import com.service.SalaryService;
import com.service.impl.SalaryServiceImpl;

/**
 * Servlet implementation class SalaryServlet
 */
@WebServlet("/SalaryServlet")
public class SalaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SalaryServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method=request.getParameter("method");
		SalaryService salaryService = new SalaryServiceImpl();
		if(method.equals("add")) {//执行新增
			String employeeName=request.getParameter("employeeName");
			Integer employeeId=Integer.parseInt(request.getParameter("employeeId"));
			String salaryMonth=request.getParameter("salaryMonth");
			Integer basicSalary=Integer.parseInt(request.getParameter("basicSalary"));
			Integer overtimePay=Integer.parseInt(request.getParameter("overtimePay"));
			Integer bonus=Integer.parseInt(request.getParameter("bonus"));
			Integer finalSalary=Integer.parseInt(request.getParameter("finalSalary"));
			
			Salary salary=new Salary(employeeName,employeeId,salaryMonth,basicSalary,overtimePay,bonus,finalSalary);
			if(salaryService.saveSalary(salary)>0) {//新增成功去列表请求拿到数据再到列表页salaryList.jsp展示
				response.sendRedirect("SalaryServlet?method=list");
			}else {//新增失败去新增页继续新增
				response.sendRedirect("salaryAdd.jsp");
			}
		}else if(method.equals("del")){//执行删除
			Integer employeeNo=Integer.parseInt(request.getParameter("employeeNo"));
			salaryService.delSalary(employeeNo);//删除之后去列表请求（list）拿到数据再到列表页salaryList.jsp展示
			response.sendRedirect("SalaryServlet?method=list");	
		}else if(method.equals("toUpdate")){//去修改页面，去修改页面之前获取要修改的工资原始数据
			Integer employeeNo=Integer.parseInt(request.getParameter("employeeNo"));
			request.setAttribute("salary", salaryService.getSalaryById(employeeNo));
			request.getRequestDispatcher("salaryUpdata.jsp").forward(request, response);
		}else if(method.equals("update")){//执行修改
			Integer employeeNo=Integer.parseInt(request.getParameter("employeeNo"));
			String employeeName=request.getParameter("employeeName");
			Integer employeeId=Integer.parseInt(request.getParameter("employeeId"));
			String salaryMonth=request.getParameter("salaryMonth");
			Integer basicSalary=Integer.parseInt(request.getParameter("basicSalary"));
			Integer overtimePay=Integer.parseInt(request.getParameter("overtimePay"));
			Integer bonus=Integer.parseInt(request.getParameter("bonus"));
			Integer finalSalary=Integer.parseInt(request.getParameter("finalSalary"));
			Salary salary=new Salary(employeeNo,employeeName,employeeId,salaryMonth,basicSalary,overtimePay,bonus,finalSalary);			
			if(salaryService.updateSalary(salary)>0) {//修改成功去列表请求拿到数据再到列表页salaryList.jsp展示
				response.sendRedirect("SalaryServlet?method=list");
			}else {//修改失败去修改页继续操作修改
				response.sendRedirect("SalaryServlet?method=toUpdate&employeeNo"+employeeNo);
			}
		}else if(method.equals("list")){//查询多个员工的工资数据，去工资列表页面展示多个员工工资的数据
			request.setAttribute("salaryList", salaryService.getSalaryList());
			request.setAttribute("user", (User)(request.getSession().getAttribute("loginuser")));
			request.getRequestDispatcher("salaryList.jsp").forward(request, response);;
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

