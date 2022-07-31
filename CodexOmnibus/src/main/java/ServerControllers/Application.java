package ServerControllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Properties;

@SpringBootApplication
public class Application
{
    public static void main(String[] args) throws Exception {

        // load properties from Parameters.config
        Properties properties = new Properties();
        properties.load(new FileInputStream("Parameters.config"));

        SpringApplication application = new SpringApplication(Application.class);
        application.setDefaultProperties(Collections.singletonMap("server.port", properties.get("PORT")));
        application.run(args);
    }
}
