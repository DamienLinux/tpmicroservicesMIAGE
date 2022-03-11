package m2.miage.fr.tpmicroservicesconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TpMicroServicesConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpMicroServicesConfigApplication.class, args);
    }

}
