package com.mino.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommonResponseDto {
	String resultCode;
	String resultMsg;
}
