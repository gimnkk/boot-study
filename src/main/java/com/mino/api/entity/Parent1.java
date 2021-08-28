package com.mino.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//�ٴ��� �ܹ���
@Entity
@Data
@NoArgsConstructor
public class Parent1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Builder
	public Parent1(String name) {
		this.name = name;
	}
}
