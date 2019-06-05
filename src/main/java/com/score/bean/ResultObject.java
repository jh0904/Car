package com.score.bean;

import lombok.Data;

@Data
public class ResultObject<T> {
	private String code;
	private String msg;
	private T data;
	private Long count;

	
	
	
	
}
