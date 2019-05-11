package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repository.UserRepository;
/**
 * 
 * @author Dharmendrasinh Barad
 *
 */
@Service
public class UserServicesDao implements UserServices {

	@Autowired
	UserRepository userRepository;

	@Override
	public User getUser(Integer id) {
        User user = userRepository.getUser(id);
		return user;
	}

}
