package com.acme.superapp.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GreetingController.class)
class GreetingControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void greetDevuelveSaludo() throws Exception {
        mvc.perform(get("/api/greet").param("nombre", "Kafka"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.mensaje").value("Hola Kafka 👋"));
    }
}