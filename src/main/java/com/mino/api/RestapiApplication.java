package com.mino.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class RestapiApplication {

	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(RestapiApplication.class);
		application.addListeners(new ApplicationPidFileWriter());
		application.run();
		//commit testt
	
	}

}
