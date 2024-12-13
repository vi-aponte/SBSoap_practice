package com.soap.springbootsoap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootsoapApplication {

	// private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootsoapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsoapApplication.class, args);
	}

	// @Bean
	// CommandLineRunner init(SoapClient soapClient) {
	// 	return args -> {
	// 		Integer numberA = 2;
	// 		Integer numberB = 2;
	// 		Integer result;

	// 		AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);

	// 		result = addResponse.getAddResult();

	// 		LOGGER.info("El resultado de la suma de los numeros {} y {} es: {}", numberA, numberB, result);
	// 	};
	// }

}
