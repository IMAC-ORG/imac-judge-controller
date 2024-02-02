package co.za.imac.judgecontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JudgeControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JudgeControllerApplication.class, args);
	}

}
