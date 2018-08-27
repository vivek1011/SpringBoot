package main.boot.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        /*
        * For getting a bean from "context":
        *
        * SampleClass sampleObject = ctxt.getBean("SampleClass.class");
        * */
    }
}
