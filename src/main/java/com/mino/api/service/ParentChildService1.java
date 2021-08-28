package com.mino.api.service;

import org.springframework.stereotype.Service;

import com.mino.api.entity.Child1;
import com.mino.api.entity.Parent1;
import com.mino.api.repository.Child1Repository;
import com.mino.api.repository.Parent1Repository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ParentChildService1 {
	private final Parent1Repository parentRepo;
	private final Child1Repository childRepo;
	
	public void save() {
		Parent1 parent = Parent1.builder().name("parent1").build();
		Child1 child1 = Child1.builder().name("child1").parent(parent).build();
		Child1 child2 = Child1.builder().name("child1").parent(parent).build();
		
		parentRepo.save(parent);
		childRepo.save(child1);
		childRepo.save(child2);
		
	}

	public Parent1 readParent() {
		return parentRepo.findById(1L).get();
		
	}

	public Child1 readChild() {
		return childRepo.findById(1L).get();
	}
	
	
}
