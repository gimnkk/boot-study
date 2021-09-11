package com.mino.api.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mino.api.entity.Student1;
import com.mino.api.entity.Subject1;
import com.mino.api.repository.Student1Repository;
import com.mino.api.repository.Subject1Repository;

import lombok.RequiredArgsConstructor;

//�ٴ�� �ܹ���
@Service
@RequiredArgsConstructor
public class StudentSubjectService1 {
	private final Student1Repository studentRepo;
	private final Subject1Repository subjectRepo;
	
	public void save() {
		//��ü�� �ƴ� �� ���� �����
		Subject1 subject1 = new Subject1();
		subject1.setName("subject1");
		
		Subject1 subject2 = new Subject1();
		subject2.setName("subject2");

		subjectRepo.save(subject1);
		subjectRepo.save(subject2);
		
		Student1 student1 = new Student1();
		Student1 student2 = new Student1();
		student1.setName("student1");
		student2.setName("student2");
		
		student1.setSubject(Arrays.asList(subject1, subject2));
		student2.setSubject(Arrays.asList(subject1, subject2));
		
		studentRepo.save(student1);
		studentRepo.save(student2);
	}
	
	public List<Student1> readStudent() {
		return studentRepo.findAll();
	}
	
	public List<Subject1> readSubject() {
		return subjectRepo.findAll();
	}
}
