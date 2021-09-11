package com.mino.api.service;

import org.springframework.stereotype.Service;

import com.mino.api.entity.Child3;
import com.mino.api.entity.Parent3;
import com.mino.api.repository.Child3Repository;
import com.mino.api.repository.Parent3Repository;

import lombok.RequiredArgsConstructor;

//다대일 양방향
@Service
@RequiredArgsConstructor
public class ParentChildService3 {
	private final Parent3Repository parentRepo;
	private final Child3Repository childRepo;
	
	public void save() {
		Parent3 parent = Parent3.builder().name("parent1").build();
		Child3 child1 = Child3.builder().name("child1").parent(parent).build();
		Child3 child2 = Child3.builder().name("child2").parent(parent).build();
		
		
		childRepo.save(child1);
		childRepo.save(child2);
		
		parentRepo.save(parent);
		
	}

	public Parent3 readParent() {
		return parentRepo.findById(1L).get();
		
	}

	public Child3 readChild() {
		return childRepo.findById(1L).get();
	}
	
	
}
