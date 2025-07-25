package com.app.dto.study.api;

import lombok.Data;

@Data
public class ApiResponseHeader {

	String resultCode;	//결과코드
	String resultMessage;	//결과 코드에 대한 설명
	
}
