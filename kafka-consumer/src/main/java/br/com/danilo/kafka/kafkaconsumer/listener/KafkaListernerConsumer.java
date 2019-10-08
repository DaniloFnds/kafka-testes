package br.com.danilo.kafka.kafkaconsumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaListernerConsumer {



    @KafkaListener(topics = "kafka_example", groupId = "grp1")
    public void consumeString(String mensagem) {

        log.info("mensagem do 1: {}", mensagem);
    }

    @KafkaListener(topics = "kafka_example", groupId = "grp1")
    public void consumeString2(String mensagem) {

        log.error("mensagem do 2: {}", mensagem);
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
