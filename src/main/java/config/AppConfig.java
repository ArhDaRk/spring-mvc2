package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import servise.CarService;
import servise.CarServiceImpl;

import java.net.CacheRequest;

@Configuration
public class AppConfig {
    @Bean
    public CarService carService(){
        return new CarServiceImpl();
    }
}
