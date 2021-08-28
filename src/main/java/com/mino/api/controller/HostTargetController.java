package com.mino.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mino.api.entity.Host1;
import com.mino.api.entity.Host2;
import com.mino.api.entity.Target1;
import com.mino.api.entity.Target2;
import com.mino.api.service.HostTargetService1;
import com.mino.api.service.HostTargetService2;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api
@RestController
@RequestMapping("/host-target")
@RequiredArgsConstructor
public class HostTargetController {
	private final HostTargetService1 hostTargetService1;
	private final HostTargetService2 hostTargetService2;
	
	//�ϴ��� �ܹ���
	
	@GetMapping("/save1")
	public void save1() {
		hostTargetService1.save();
	}
	
	@GetMapping("/read-host1")
	public Host1 readHost1() {
		return hostTargetService1.read2();
	}
	
	@GetMapping("/read-target1")
	public Target1 readTarget1() {
		return hostTargetService1.read1();
	}
	
	//�ϴ��� �����
	//��ȯ���� ����. 2����. 1-������̼����� 1���� ���� �����ϵ��� ����@JsonIgnore, 2-�Ǵٸ����
	@GetMapping("/save2")
	public void save2() {
		hostTargetService2.save();
	}
	
	@GetMapping("/read-host2")
	public Host2 readHost12() {
		return hostTargetService2.read2();
	}
	
	@GetMapping("/read-target2")
	public Target2 readTarget2() {
		return hostTargetService2.read1();
	}
}
