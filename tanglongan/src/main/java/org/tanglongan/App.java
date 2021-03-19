package org.tanglongan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.tanglongan.config.AppConfig;
import org.tanglongan.model.User;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = context.getBean("user", User.class);
		user.sayHi();
	}

}
