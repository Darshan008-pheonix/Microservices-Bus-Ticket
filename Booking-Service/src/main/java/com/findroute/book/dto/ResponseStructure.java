package com.findroute.book.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStructure <T>{

	private T data;
	private String msg;
	private int statusCode;
}
