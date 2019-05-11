package com.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.User;
import com.entity.UserId;

/**
 * 
 * @author Dharmendrasinh Barad
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, UserId>{
   /**
    * 
    * @param id
    * @return
    */
   @Query("SELECT user FROM User user WHERE user.id.userID = ?1")
	public User getUser(Integer id);
}
