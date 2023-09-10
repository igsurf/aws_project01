package br.com.siecola.aws_project01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest (@PathVariable String name) {

            LOG.info("Test Controller - name:{}", name);
            return ResponseEntity.ok("Name: " + name);
    }
}