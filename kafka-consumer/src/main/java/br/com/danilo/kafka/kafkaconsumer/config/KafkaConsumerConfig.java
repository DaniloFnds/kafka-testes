package br.com.danilo.kafka.kafkaconsumer.config;

import br.com.danilo.kafka.kafkaconsumer.model.Usuario;
import com.google.common.collect.ImmutableMap;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Configuration
@EnableKafka
public class KafkaConsumerConfig {

    @Bean
    public ConsumerFactory<String, String> consumerStrFactory() {
        return new DefaultKafkaConsumerFactory<>(
                ImmutableMap.of(
                        ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092"
                        , ConsumerConfig.GROUP_ID_CONFIG, "group_str_id"
                        , ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class
                        , ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class
                )
        );
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> containerFactory = new ConcurrentKafkaListenerContainerFactory<>();
        containerFactory.setConsumerFactory(consumerStrFactory());
        return containerFactory;
    }

    @Bean
    public ConsumerFactory<String, Usuario> usuarioConsumerFactory() {
        return new DefaultKafkaConsumerFactory<>(
                ImmutableMap.of(
                        ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092"
                        , ConsumerConfig.GROUP_ID_CONFIG, "group_str_id"
                        , ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class
                        , ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class
                ),new StringDeserializer(), new JsonDeserializer<>(Usuario.class)
        );
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Usuario> kafkaUsuarioListener() {
        ConcurrentKafkaListenerContainerFactory<String, Usuario> containerFactory = new ConcurrentKafkaListenerContainerFactory<>();
        containerFactory.setConsumerFactory(usuarioConsumerFactory());
        return containerFactory;
    }
}
