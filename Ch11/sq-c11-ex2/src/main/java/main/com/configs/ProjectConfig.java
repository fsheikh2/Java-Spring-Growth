package main.com.configs;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients( basePackages = "main.com.proxies")
public class ProjectConfig {
}
