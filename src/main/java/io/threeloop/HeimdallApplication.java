package io.threeloop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HeimdallApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeimdallApplication.class, args);
	}
}

@RestController
class MessageRestController {

	@Value("${spring.application.name}")
	private String message;

	@RequestMapping("/hello")
	String msg() {
		return "application instance spawned for:" + this.message;
	}
}