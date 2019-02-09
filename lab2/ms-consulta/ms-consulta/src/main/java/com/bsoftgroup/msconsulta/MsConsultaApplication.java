package com.bsoftgroup.msconsulta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsConsultaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConsultaApplication.class, args);
	}

}

