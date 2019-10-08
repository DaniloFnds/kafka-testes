package br.com.danilo.kafka.kafkaproducer.resources;

import br.com.danilo.kafka.kafkaproducer.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    private KafkaTemplate<String, Usuario> kafkaTemplate;

    @GetMapping("/publicar/{nome}")
    public String publicar(@PathVariable(name = "nome") String nome) {
        for(int i = 0; i < 1000; i++) {
        kafkaTemplate.send("kafka_example", new Usuario(String.valueOf(i) , "Sobrenome"));

        }
        return "Publicado";
    }
}
