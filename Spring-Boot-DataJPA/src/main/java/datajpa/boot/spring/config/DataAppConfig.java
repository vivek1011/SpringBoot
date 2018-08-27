package datajpa.boot.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources(
        @PropertySource(value = {"classpath:data-jpa.properties"} )
)
public class DataAppConfig {
}
