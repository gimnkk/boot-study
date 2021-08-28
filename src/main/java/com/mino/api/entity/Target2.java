package com.mino.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
//¾ç¹æÇâ
public class Target2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String name;
	
	@OneToOne(mappedBy = "target")
	private Host2 host;
	
	@Builder
	public Target2(String name, Host2 host) {
		this.name = name;
		this.host = host;
	}
}
