package com.solomka;

import com.solomka.repository.LaptopRepository;
import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import java.util.Date;

@SpringBootApplication
//@ComponentScan({"com.solomka.service"})
//@EntityScan("com.solomka.model")
//@EnableJpaRepositories("com.solomka.repository")
public class SpringDataApp  {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataApp.class, args);
    }
}
