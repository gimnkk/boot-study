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
//�ϴ��� �����
public class Host2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	//OneToOne�� �ϴ��� �� ���°�.
	@OneToOne
	@JoinColumn(name = "target_id")
	private Target2 target;
	
	@Builder
	public Host2(String name, Target2 target) {
		this.name = name;
		this.target = target;
	}
	
	//���Ӽ�, ��ü�� ����
}
