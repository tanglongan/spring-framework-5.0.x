package org.tanglongan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tanglongan.model.User;

@Configuration
public class AppConfig {

	@Bean("user")
	public User queryUser() {
		return new User("tanglongan", "happy every day!");
	}

}
