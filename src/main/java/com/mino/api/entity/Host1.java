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
//�ϴ��� �ܹ��� host to target
public class Host1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	//OneToOne�� �ϴ��� �ܹ������� ���°�. Host1������ target�� ���� target���� Host ���� �ȵ�
	@OneToOne
	@JoinColumn(name = "target_id")
	private Target1 target;
	
	@Builder
	public Host1(String name, Target1 target) {
		this.name = name;
		this.target = target;
	}
	
	//���Ӽ�, ��ü�� ����
}
