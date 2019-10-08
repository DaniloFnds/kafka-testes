package br.com.danilo.kafka.kafkaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"br.com.danilo.kafka.kafkaproducer","br.com.danilo.kafka.teste", "br.com.fromtis.danilo.kafka.fundo"})
@EnableJpaRepositories(basePackages = "br.com.fromtis.danilo.fundo")
public class KafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApplication.class, args);
	}

}
