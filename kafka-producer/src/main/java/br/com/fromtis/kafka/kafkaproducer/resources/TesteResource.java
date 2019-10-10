package br.com.fromtis.kafka.kafkaproducer.resources;

import br.com.fromtis.fundo.IFundo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
public class TesteResource {

    @Autowired
    private IFundo fundo;

    @GetMapping("/nome")
    public String init() {
        return "Danilo";
    }
}
