package com.acme.superapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class SuperappApplicationTests {
    // vacío: solo comprueba que el contexto arranca

    @Test
    void contextLoads() {
    }
}
