package com.example.algamoney.api;

import com.example.algamoney.api.config.property.AlgamoneyApiProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(AlgamoneyApiProperty.class)
public class AlgamoneyApiAtualApplication {
	
	private static ApplicationContext APPLICATION_CONTEXT;

	public static void main(String[] args) {
		APPLICATION_CONTEXT = SpringApplication.run(AlgamoneyApiAtualApplication.class, args);
	}
	
	public static <T> T getBean(Class<T> type) {
		return APPLICATION_CONTEXT.getBean(type);
	}
}
