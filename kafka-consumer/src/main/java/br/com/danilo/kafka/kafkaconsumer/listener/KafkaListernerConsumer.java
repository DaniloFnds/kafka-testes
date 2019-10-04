package br.com.danilo.kafka.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListernerConsumer {

    @KafkaListener(topics = "kafka_example",groupId = "group_str_id")
    public void consumeString(String mensagem) {
        System.out.println("Mensagem Recebdio: " +mensagem);
    }
}
