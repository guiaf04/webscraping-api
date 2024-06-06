package web.scrapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.scrapping.service.ScrapperService;

@RestController
@RequestMapping("/api/result")
public class ScrappingController {
    @Autowired
    ScrapperService scrapperService;
    @GetMapping
    public String getScrapping(){
        return scrapperService.scrape().toString();
    }
}
