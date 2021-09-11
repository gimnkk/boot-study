package com.mino.api.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mino.api.entity.Student2;
import com.mino.api.entity.Subject2;
import com.mino.api.repository.Student2Repository;
import com.mino.api.repository.Subject2Repository;

import lombok.RequiredArgsConstructor;

//�ٴ�� �����
//������� ���� �Ⱦ��ϱ� �������θ� �˾Ƶ� ��
@Service
@RequiredArgsConstructor
public class StudentSubjectService2 {
	private final Student2Repository studentRepo;
	private final Subject2Repository subjectRepo;
	
	public void save() {
		//��ü�� �ƴ� �� ���� �����
		Subject2 subject1 = new Subject2();
		subject1.setName("subject1");
		
		Subject2 subject2 = new Subject2();
		subject2.setName("subject2");

		subjectRepo.save(subject1);
		subjectRepo.save(subject2);
		
		Student2 student1 = new Student2();
		Student2 student2 = new Student2();
		student1.setName("student1");
		student2.setName("student2");
		
		student1.setSubject(Arrays.asList(subject1, subject2));
		student2.setSubject(Arrays.asList(subject1, subject2));
		
		studentRepo.save(student1);
		studentRepo.save(student2);
	}
	
	public List<Student2> readStudent() {
		return studentRepo.findAll();
	}
	
	public List<Subject2> readSubject() {
		return subjectRepo.findAll();
	}
}
