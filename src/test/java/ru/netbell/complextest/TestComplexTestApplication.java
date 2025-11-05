package ru.netbell.complextest;

import org.springframework.boot.SpringApplication;

public class TestComplexTestApplication {

    public static void main(String[] args) {
        SpringApplication.from(ComplexTestApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
