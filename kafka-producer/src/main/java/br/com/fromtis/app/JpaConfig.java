package br.com.fromtis.app;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"br.com.fromtis.pessoa", "br.com.fromtis.fundo"})
@EntityScan(basePackages = {"br.com.fromtis.pessoa", "br.com.fromtis.fundo"})
@Configuration
public class JpaConfig {

    public JpaConfig() {
        System.out.println("Carregando Jpa Config");
    }
}
