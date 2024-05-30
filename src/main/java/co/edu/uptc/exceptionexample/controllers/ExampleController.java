package co.edu.uptc.exceptionexample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleController {

    @GetMapping("/division")
    public String division(@RequestParam int a, @RequestParam int b) {
        int resultado = a / b;
        return "Resultado de la división: " + resultado;
    }
}
