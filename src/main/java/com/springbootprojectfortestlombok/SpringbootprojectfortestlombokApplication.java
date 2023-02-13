package com.springbootprojectfortestlombok;

import com.springbootprojectfortestlombok.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootprojectfortestlombokApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootprojectfortestlombokApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setId("1");
        System.out.println(student.getId());

    }





}
