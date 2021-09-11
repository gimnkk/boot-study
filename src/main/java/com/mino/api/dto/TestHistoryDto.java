package com.mino.api.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestHistoryDto {
	@Column(name = "req_date")
	private LocalDateTime reqDate;
	
	@Column(name = "status")
	private String status;

	@Column(name = "expire_date")
	private LocalDateTime expireDate;
}
