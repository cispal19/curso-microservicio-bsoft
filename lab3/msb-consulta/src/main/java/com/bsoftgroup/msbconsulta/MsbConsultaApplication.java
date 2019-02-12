package com.bsoftgroup.msbconsulta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.bsoftgroup.msbconsulta.interfaces")
@EnableDiscoveryClient
public class MsbConsultaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsbConsultaApplication.class, args);
	}

}

