package store.aurora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AuroraEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuroraEurekaApplication.class, args);
    }

}
