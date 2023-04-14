package com.jsp.teacher_servlet_crud_operation.Service;

import java.util.List;

import com.jsp.teacher_servlet_crud_operation.Dao.TeacherDao;
import com.jsp.teacher_servlet_crud_operation.Dto.Teacher;

public class TeacherService {

	TeacherDao dao = new TeacherDao();

	// saveMethods
	public Teacher saveTeacher(Teacher teacher) {
		return dao.saveTeacher(teacher);
	}

	// delete method
	public int deleteTeacher(int id) {

		return dao.deleteTeacher(id);
	}

	// displayMethodForEmployee
	public List<Teacher> displaTeacher() {

		return dao.displaTeacher();
	}

	// updateMethod For Employee
	public int updateEmployee(Teacher teacher, int teacherId) {

		return dao.updateEmployee(teacher, teacherId);
	}
}
