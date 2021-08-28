package com.mino.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//다대일 단방향
@Entity
@Data
@NoArgsConstructor
public class Child1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Parent1 parent;
	
	@Builder
	public Child1 (String name, Parent1 parent) {
		this.name = name;
		this.parent = parent;
	}
}
