package boot.spring.CommandLineRunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        /*
            Load some data into memory ...

            This method will be executed just after application context is loaded
            and right before the Spring Application Run method is completed.
        * */
    }
}
