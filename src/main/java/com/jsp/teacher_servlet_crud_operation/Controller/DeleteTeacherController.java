package com.jsp.teacher_servlet_crud_operation.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.teacher_servlet_crud_operation.Service.TeacherService;

public class DeleteTeacherController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		TeacherService service = new TeacherService();
		
		int tableId = service.deleteTeacher(id);
		
		if(tableId!=0) {
			req.getRequestDispatcher("display.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("display.jsp").forward(req, resp);
		}

}
}