package configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"proxies", "repositories", "services"})
public class ProjectConfiguration {
}
