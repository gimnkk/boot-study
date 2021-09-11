package com.mino.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mino.api.entity.Child1;
import com.mino.api.entity.Child2;
import com.mino.api.entity.Child3;
import com.mino.api.entity.Parent1;
import com.mino.api.entity.Parent2;
import com.mino.api.entity.Parent3;
import com.mino.api.service.ParentChildService1;
import com.mino.api.service.ParentChildService2;
import com.mino.api.service.ParentChildService3;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api
@RestController
@RequestMapping("/parent-child")
@RequiredArgsConstructor
public class ParentChildController {
	private final ParentChildService1 pcService1;
	private final ParentChildService2 pcService2;
	private final ParentChildService3 pcService3;
	
	@GetMapping("/save1")
	public void save1() {
		pcService1.save();
	}
	
	@GetMapping("read-parent1")
	public Parent1 readParent1() {
		return pcService1.readParent();
	}
	
	@GetMapping("read-child1")
	public Child1 readChild1() {
		return pcService1.readChild();
	}
	
	@GetMapping("/save2")
	public void save2() {
		pcService2.save();
	}
	
	@GetMapping("read-parent2")
	public Parent2 readParent2() {
		return pcService2.readParent();
	}
	
	@GetMapping("read-child2")
	public Child2 readChild2() {
		return pcService2.readChild();
	}
	@GetMapping("/save3")
	public void save3() {
		pcService3.save();
	}
	
	@GetMapping("read-parent3")
	public Parent3 readParent3() {
		return pcService3.readParent();
	}
	
	@GetMapping("read-child3")
	public Child3 readChild3() {
		return pcService3.readChild();
	}
}
