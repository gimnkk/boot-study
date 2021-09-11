package com.mino.api.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.NoArgsConstructor;

//다대다 양방향
@Entity
@NoArgsConstructor
@Data
public class Student2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@ManyToMany
	@JoinTable(name="student_subject2", joinColumns = 
	@JoinColumn(name = "student_id"), 	inverseJoinColumns = 
	@JoinColumn(name = "subject_code"))
	@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class)
	private List<Subject2> subject = new ArrayList<Subject2>();
}
