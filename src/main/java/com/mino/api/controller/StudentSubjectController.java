package com.mino.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mino.api.entity.Student1;
import com.mino.api.entity.Student2;
import com.mino.api.entity.Subject1;
import com.mino.api.entity.Subject2;
import com.mino.api.service.StudentSubjectService1;
import com.mino.api.service.StudentSubjectService2;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api
@RestController
@RequestMapping("/student-subject")
@RequiredArgsConstructor
public class StudentSubjectController {
	private final StudentSubjectService1 stsbService1;
	private final StudentSubjectService2 stsbService2;
	
	@GetMapping("/save1")
	public void save1() {
		stsbService1.save();
	}
	
	@GetMapping("read-student1")
	public List<Student1> readStudent1() {
		return stsbService1.readStudent();
	}
	
	@GetMapping("read-subject1")
	public List<Subject1> readSubject1() {
		return stsbService1.readSubject();
	}
	
	@GetMapping("/save2")
	public void save2() {
		stsbService2.save();
	}
	
	@GetMapping("read-student2")
	public List<Student2> readStudent2() {
		return stsbService2.readStudent();
	}
	
	@GetMapping("read-subject2")
	public List<Subject2> readSubject2() {
		return stsbService2.readSubject();
	}
}
