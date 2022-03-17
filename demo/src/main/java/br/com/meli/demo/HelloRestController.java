package br.com.meli.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
