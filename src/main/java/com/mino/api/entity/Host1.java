package com.mino.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
//일대일 단방향 host to target
public class Host1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	//OneToOne은 일대일 단방향으로 보는것. Host1에서만 target을 보고 target에서 Host 연결 안됨
	@OneToOne
	@JoinColumn(name = "target_id")
	private Target1 target;
	
	@Builder
	public Host1(String name, Target1 target) {
		this.name = name;
		this.target = target;
	}
	
	//영속성, 개체의 주인
}
