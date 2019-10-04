package br.com.danilo.kafka.kafkaproducer.config;

import br.com.danilo.kafka.kafkaproducer.model.Usuario;
import com.google.common.collect.ImmutableMap;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration
public class KafkaConfig {

    @Bean
    public ProducerFactory<String, Usuario> producerFactoryUsuario() {
        return new DefaultKafkaProducerFactory<>(ImmutableMap.of(
                ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092"
                , ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class
                , ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class
        ));
    }

    @Bean
    public KafkaTemplate<String, Usuario> usuarioKafkaTemplate() {
        return new KafkaTemplate<>(producerFactoryUsuario());
    }
}
