package com.app.dto.study.api;

import lombok.Data;

@Data
public class ApiResponseDelivery {
	ApiResponseHeader header;
	ApiDelivery body;
}
