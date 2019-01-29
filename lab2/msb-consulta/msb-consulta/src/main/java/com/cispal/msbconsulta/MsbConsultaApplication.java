package com.cispal.msbconsulta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cispal.msbconsulta.interfaces")
public class MsbConsultaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsbConsultaApplication.class, args);
	}

}
