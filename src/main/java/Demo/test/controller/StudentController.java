package Demo.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import view.ViewStudent;

@RestController
@RequestMapping(value="students")
public class StudentController {
	
	
	@GetMapping(value="/students")
	public List<ViewStudent> getStudentsData() {
		System.out.println("Students data......");
		ViewStudent viewStudent = new ViewStudent();
		viewStudent.setCourse("Spring boot");
		viewStudent.setId(101);
		viewStudent.setName("Praneeth");
		ViewStudent viewStudent2 = new ViewStudent();
		viewStudent2.setCourse("Spring boot");
		viewStudent2.setId(102);
		viewStudent2.setName("Charan");
		ViewStudent viewStudent3 = new ViewStudent();
		viewStudent3.setCourse("Spring boot");
		viewStudent3.setId(103);
		viewStudent3.setName("sa");
		
		List<ViewStudent> viewStudents= new ArrayList<ViewStudent>();
		viewStudents.add(viewStudent);
		viewStudents.add(viewStudent2);
		viewStudents.add(viewStudent3);
		return viewStudents;
	}
	
	
		
	
	
	
}
