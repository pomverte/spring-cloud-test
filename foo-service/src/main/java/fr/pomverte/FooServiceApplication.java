package fr.pomverte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@SpringBootApplication
public class FooServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FooServiceApplication.class, args);
    }
}

@ConfigurationProperties
class MessageProperties {
    @Getter
    @Setter
    private String message;
}

@RestController
@EnableConfigurationProperties(MessageProperties.class)
class SimpleController {
    @Autowired
    private MessageProperties messageProperties;

    @GetMapping("/message")
    public String message() {
        return messageProperties.getMessage();
    }
}
