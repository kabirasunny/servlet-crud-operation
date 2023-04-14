package com.jsp.teacher_servlet_crud_operation.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.teacher_servlet_crud_operation.Dto.Teacher;
import com.jsp.teacher_servlet_crud_operation.Service.TeacherService;

public class TeacherInsertController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		String name = req.getParameter("name");

		String email = req.getParameter("email");
		
		long phone = Integer.parseInt(req.getParameter("phone"));
		
		Teacher teacher = new Teacher();
		
		teacher.setId(id);
		teacher.setName(name);
		teacher.setEmail(email);
		teacher.setPhone(phone);
		
		TeacherService service = new TeacherService();
		
		service.saveTeacher(teacher);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("register.jsp");
		dispatcher.forward(req, resp);
		
	}

}
