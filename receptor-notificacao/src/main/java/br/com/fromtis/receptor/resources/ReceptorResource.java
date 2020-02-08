package br.com.fromtis.receptor.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/receptor", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
@CrossOrigin(origins = "http://localhost:9090")
public class ReceptorResource {

    @PostMapping(path = "/notificar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String recebeNotificacao(@RequestBody Notificacao notificacao) {


        return "OK";
    }
}
