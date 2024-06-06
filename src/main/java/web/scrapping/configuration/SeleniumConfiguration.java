package web.scrapping.configuration;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeleniumConfiguration {

    @PostConstruct
    void postConstructor(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\guilh\\Downloads\\scrapping\\src\\main\\resources\\msedgedriver.exe");
    }

    @Bean
    public EdgeDriver driver(){
        return new EdgeDriver();
    }
}
