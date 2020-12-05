package com.genil.learning.airlines.baggage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;

@SpringBootApplication
public class BaggageApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(BaggageApplication.class)
				.applicationStartup(new FlightRecorderApplicationStartup())
				.run(args);
//		SpringApplication.run(BaggageApplication.class, args);
	}

}
