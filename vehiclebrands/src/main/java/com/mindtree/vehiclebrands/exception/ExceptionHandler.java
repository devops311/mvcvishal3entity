package com.mindtree.vehiclebrands.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ResponseStatus;

import com.mindtree.vehiclebrands.controller.VehicleBrandsController;
@ControllerAdvice(assignableTypes=VehicleBrandsController.class)
public class ExceptionHandler extends ServiceException {
	@org.springframework.web.bind.annotation.ExceptionHandler(value= {NoSuchDealerException.class})
	@ResponseStatus(HttpStatus.BAD_GATEWAY)
	public ResponseEntity<String> getallbikeunderdealer(NoSuchDealerException e){
		return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(e.getMessage());

}
}
