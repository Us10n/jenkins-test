package com.example.jenkinstest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldFail() {
        Assertions.assertTrue(true);
//        Assertions.fail();
    }
}
