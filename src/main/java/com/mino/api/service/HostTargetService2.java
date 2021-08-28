package com.mino.api.service;

import org.springframework.stereotype.Service;

import com.mino.api.entity.Host1;
import com.mino.api.entity.Host2;
import com.mino.api.entity.Target1;
import com.mino.api.entity.Target2;
import com.mino.api.repository.Host2Repository;
import com.mino.api.repository.Target2Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
//양방향
//양방향은 save 순서가 중요
public class HostTargetService2 {
	private final Target2Repository targetRepo;
	private final Host2Repository hostRepo;
	
	//빌더가 일종의 생성자
	public void save() {
		Target2 target = Target2.builder().name("target2").build();
		Host2 host = Host2.builder().name("host2").target(target).build();
		
		targetRepo.save(target);
		hostRepo.save(host);
	}
	
	public Target2 read1() {
		return targetRepo.findById(1L).get();
	}
	public Host2 read2() {
		return hostRepo.findById(1L).get();
	}
}
