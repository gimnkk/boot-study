package com.mino.api.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//다대일 양방향
@Entity
@Data
@NoArgsConstructor
public class Parent3 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "parent")
	private List<Child3> childList;
	
	@Builder
	public Parent3(String name, List<Child3> childList) {
		this.name = name;
		this.childList = childList;
	}
}
