package com.mino.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//일대다 단방향
@Entity
@Data
@NoArgsConstructor
public class Child2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Builder
	public Child2 (String name) {
		this.name = name;
	}
}
