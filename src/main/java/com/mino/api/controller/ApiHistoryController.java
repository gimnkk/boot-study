package com.mino.api.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mino.api.dto.CommonResponseDto;
import com.mino.api.entity.ApiHistoryEntity;
import com.mino.api.service.ApiHistoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = { "1.ApiHistory" })
@RequestMapping("/api/v1/history")
public class ApiHistoryController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ApiHistoryService apiHistoryService;

	@ApiOperation(value = "�����丮 ����", notes = "�����丮 ������ ����Ѵ�.")
	@PostMapping("/create")
	public ResponseEntity<CommonResponseDto> createHistory(@Valid @RequestBody ApiHistoryEntity apiHistoryParam) {
		logger.info(apiHistoryParam.toString());
		apiHistoryService.createHistory(apiHistoryParam);

		return new ResponseEntity<>(new CommonResponseDto("S00", "�����Ͽ����ϴ�."), HttpStatus.OK);
	}

	@ApiOperation(value = "�����丮 ��ȸ", notes = "�����丮 ������ ��ȸ �Ѵ�.")
	@GetMapping("/read/{historyKeyParam}")
	public ResponseEntity<CommonResponseDto> readHistory(@PathVariable String historyKeyParam) {
		logger.info(historyKeyParam);
		apiHistoryService.readHistory(historyKeyParam);
		return new ResponseEntity<>(new CommonResponseDto("S00", "�����Ͽ����ϴ�."), HttpStatus.OK);
	}

	@ApiOperation(value = "�����丮 ����", notes = "�����丮 ������ �����Ѵ�.")
	@PutMapping("/update")
	public ResponseEntity<CommonResponseDto> updateHistory(@Valid @RequestBody ApiHistoryEntity apiHistoryParam) {
		logger.info(apiHistoryParam.toString());
		apiHistoryService.updateHistory(apiHistoryParam);
		return new ResponseEntity<>(new CommonResponseDto("S00", "�����Ͽ����ϴ�."), HttpStatus.OK);
	}

	@ApiOperation(value = "�����丮 ����", notes = "�����丮 ������ �����Ѵ�.")
	@DeleteMapping("/delete/{historyKeyParam}")
	public ResponseEntity<CommonResponseDto> deleteHistory(@PathVariable String historyKeyParam) {
		logger.info(historyKeyParam);
		apiHistoryService.deleteHistory(historyKeyParam);
		return new ResponseEntity<>(new CommonResponseDto("S00", "�����Ͽ����ϴ�."), HttpStatus.OK);
	}

}
