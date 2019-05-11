package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
/**
 * 
 * @author Dharmendrasinh Barad
 *
 */
@Embeddable
public class UserId implements Serializable {

	@Column(name = "user_id")
	private Integer userID;

	@Column(name = "user_mobile")
	private Long mobile;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

}
