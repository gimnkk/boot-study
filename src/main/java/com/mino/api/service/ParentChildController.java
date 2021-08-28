package com.mino.api.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mino.api.entity.Child1;
import com.mino.api.entity.Parent1;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@Api
@RestController
@RequestMapping("/parent-child")
@RequiredArgsConstructor
public class ParentChildController {
	private final ParentChildService1 pcService1;
	
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
}
