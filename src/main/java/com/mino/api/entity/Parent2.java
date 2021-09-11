package com.mino.api.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//일대다
@Entity
@Data
@NoArgsConstructor
public class Parent2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	//주체가 Parent
	@OneToMany
	@JoinColumn(name = "parent_id")
	private List<Child2> childList;
	
	@Builder
	public Parent2(String name, List<Child2> childList) {
		this.name = name;
		this.childList = childList;
	}
}
