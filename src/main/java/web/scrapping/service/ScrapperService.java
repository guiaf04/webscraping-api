package web.scrapping.service;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScrapperService {
    private static final String url = "http://bianca.com/";
    private final EdgeDriver driver;

    public List<String> scrape(){
        driver.get(url);
        final WebElement words= driver.findElement(By.tagName("body"));
        final List<WebElement> content = words.findElements(By.tagName("h1"));
        List<String> contentReturn = content.stream().map(WebElement::getText).toList();
        driver.quit();

        return contentReturn;
    }
}
