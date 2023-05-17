package com.hackerNews.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.hackerNews.Utilty.AppConstants;
import com.hackerNews.model.ExceptionResponse;

/**
 * Exception handler class for all Exception classes
 * 
 * @author Pragya Jha
 *
 */
@ControllerAdvice
public class HnApiExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = NoRecordFoundException.class)
	public ResponseEntity<Object> handleNoRecordFoundException(NoRecordFoundException ex) {
		return new ResponseEntity<>(new ExceptionResponse(), HttpStatus.OK);
	}

	@ExceptionHandler(value = ConnectionException.class)
	public ResponseEntity<Object> handleConnectionException(ConnectionException ex) {
		return new ResponseEntity<>(new ExceptionResponse(),
				HttpStatus.BAD_GATEWAY);
	}

	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<Object> handleRuntimeExceptionRuntimeException(RuntimeException ex) {
		return new ResponseEntity<>(new ExceptionResponse(),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
