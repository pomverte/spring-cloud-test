package fr.pomverte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// tag::asciidoc-EnableConfigServer[]
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
// end::asciidoc-EnableConfigServer[]

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
