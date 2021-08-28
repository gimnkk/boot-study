package com.mino.api.service;

import org.springframework.stereotype.Service;

import com.mino.api.entity.Host1;
import com.mino.api.entity.Target1;
import com.mino.api.repository.Host1Repository;
import com.mino.api.repository.Target1Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HostTargetService1 {
	private final Target1Repository targetRepo;
	private final Host1Repository hostRepo;
	
	//빌더가 일종의 생성자
	public void save() {
		Target1 target = Target1.builder().name("target1").build();
		Host1 host = Host1.builder().name("host1").target(target).build();
		
		targetRepo.save(target);
		hostRepo.save(host);
	}
	
	public Target1 read1() {
		return targetRepo.findById(1L).get();
	}
	public Host1 read2() {
		return hostRepo.findById(1L).get();
	}
}
