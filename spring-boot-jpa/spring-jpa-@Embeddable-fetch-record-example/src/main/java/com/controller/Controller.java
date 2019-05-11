package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.entity.User;
import com.services.UserServices;

/**
 * 
 * @author Dharmendrasinh Barad
 *
 */
@RestController
public class Controller {

	@Autowired
	UserServices userServices;

	@GetMapping(value = "/getUsers/{id}")
	public ResponseEntity getUsers(@PathVariable Integer id) {
		/* System.out.println(id.getUserID()); */
		 User user = userServices.getUser(id);
		return new ResponseEntity(user,HttpStatus.OK);
	}
}
