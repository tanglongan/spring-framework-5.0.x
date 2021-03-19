package org.tanglongan.model;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {

	Logger log = LoggerFactory.getLogger(User.class);

	private String username;
	private String message;

	public User() {
	}

	public User(String username, String message) {
		this.username = username;
		this.message = message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public void sayHi() {
		log.info(JSON.toJSONString(this));
	}

}
