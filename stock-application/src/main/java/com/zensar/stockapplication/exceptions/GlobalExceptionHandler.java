package com.zensar.stockapplication.exceptions;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	/*@ExceptionHandler(InvalidStockIdException.class)
	public ResponseEntity<Object> handleStockError(RuntimeException exception,WebRequest request){
		return handleExceptionInternal(exception, exception.toString(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
		
	}*/
	@ExceptionHandler(InvalidStockIdException.class)
	public ResponseEntity<CustomErrorResponse> handleStockError(HttpServletResponse response){
		CustomErrorResponse response1=new CustomErrorResponse();
		response1.setTimestamp(LocalDateTime.now());
		response1.setStatus(400);
		response1.setError("Invalid ID not accepted");
		return new ResponseEntity<CustomErrorResponse>(response1,HttpStatus.BAD_REQUEST);
	}
		
}
