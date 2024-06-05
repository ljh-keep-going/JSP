package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Attendance;
import com.entity.User;
import com.service.AttendanceService;
import com.service.impl.AttendanceServiceImpl;


/**
 * Servlet implementation class AttendanceServlet
 */
@WebServlet("/AttendanceServlet")
public class AttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttendanceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method=request.getParameter("method");
		AttendanceService attendanceService = new AttendanceServiceImpl();
		if(method.equals("add")) {//执行新增
			String attendanceName=request.getParameter("attendanceName");
			String attendanceDept=request.getParameter("attendanceDept");
			String attendancePost=request.getParameter("attendancePost");
			String attendanceGet=request.getParameter("attendanceGet");
			String attendanceLate=request.getParameter("attendanceLate");
			String attendanceAdd=request.getParameter("attendanceAdd");
			String attendanceCard=request.getParameter("attendanceCard");
			String attendanceCond=request.getParameter("attendanceCond");
			
			Attendance attendance=new Attendance(attendanceName,attendanceDept,attendancePost,attendanceGet,attendanceLate,attendanceAdd,attendanceCard,attendanceCond);
			if(attendanceService.saveAttendance(attendance)>0) {//成功去列表请求拿到数据再到列表页attendanceList.jap展示
				response.sendRedirect("AttendanceServlet?method=list");
			}else {//新增失败去新增页继续新增
				response.sendRedirect("attendanceAdd.jsp");
			}
		}else if(method.equals("del")){//执行删除
			Integer attendanceId=Integer.parseInt(request.getParameter("attendanceId"));
			attendanceService.delAttendance(attendanceId);//删除之后去列表请求（list）拿到数据再到列表页attendanceList.jap展示
			response.sendRedirect("AttendanceServlet?method=list");	
		}else if(method.equals("toUpdate")){//去修改页面，去修改页面之前获取要修改的管理员的原始数据
			Integer attendanceId=Integer.parseInt(request.getParameter("attendanceId"));
			request.setAttribute("attendance", attendanceService.getAttendanceById(attendanceId));
			request.getRequestDispatcher("attendanceUpdate.jsp").forward(request, response);;
		}else if(method.equals("update")){//执行修改
			Integer attendanceId=Integer.parseInt(request.getParameter("attendanceId"));
			String attendanceName=request.getParameter("attendanceName");
			String attendanceDept=request.getParameter("attendanceDept");
			String attendancePost=request.getParameter("attendancePost");
			String attendanceGet=request.getParameter("attendanceGet");
			String attendanceLate=request.getParameter("attendanceLate");
			String attendanceAdd=request.getParameter("attendanceAdd");
			String attendanceCard=request.getParameter("attendanceCard");
			String attendanceCond=request.getParameter("attendanceCond");
			Attendance attendance=new Attendance(attendanceId,attendanceName,attendanceDept,attendancePost,attendanceGet,attendanceLate,attendanceAdd,attendanceCard,attendanceCond);			
			if(attendanceService.updateAttendance(attendance)>0) {//成功去列表请求拿到数据再到列表页attendanceList.jap展示
				response.sendRedirect("AttendanceServlet?method=list");
			}else {//修改失败去修改页继续操作修改
				response.sendRedirect("AttendanceServlet?method=toUpdate&attendanceId"+attendanceId);
			}
		}else if(method.equals("list")){//查询多个管理员，去管理员列表页面展示多个管理员数据
			request.setAttribute("attendanceList", attendanceService.getAttendanceList());
			request.setAttribute("user", (User)(request.getSession().getAttribute("loginuser")));
			request.getRequestDispatcher("attendanceList.jsp").forward(request, response);;
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
