package com.hyunsu.java_campus.configurations;

import com.hyunsu.java_campus.models.Employee;
import com.hyunsu.java_campus.repositories.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

@Bean
public CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Employee("홍길동", "burglar")));
      log.info("Preloading " + repository.save(new Employee("백두산", "thief")));
    };
  }
}