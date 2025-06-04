package com.acme.superapp.api;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/greet")
    public Map<String, String> greet(
            @RequestParam(defaultValue = "mundo") String nombre
    ) {
        return Map.of("mensaje", "Hola " + nombre + " 👋");
    }
}