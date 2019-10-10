package br.com.fromtis.app;

import br.com.fromtis.fundo.entity.Fundo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

//@EnableJpaRepositories
@EntityScan(basePackages = {"br.com.fromtis.pessoa", "br.com.fromtis.fundo"})
@SpringBootApplication(scanBasePackages = "br.com.fromtis.fundo")
public class KafkaProducerApplication {



	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(KafkaProducerApplication.class, args);
		for (String beanDefinitionName : run.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
	}
}
