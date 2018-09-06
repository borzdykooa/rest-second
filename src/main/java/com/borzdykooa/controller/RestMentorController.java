package com.borzdykooa.controller;

import com.borzdykooa.dto.Mentor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Класс, ответственный за передачу информации по REST-запросу
 */
@RestController
public class RestMentorController {

    @GetMapping("/test")
    public Mentor showTestPage() {
        return new Mentor("Vladimir Vladimirov", "C", 10);
    }
}
