package com.google.google.controllers;

import com.google.google.entities.WebPage;
import com.google.google.services.SearchService;
import com.google.google.services.SpiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class SearchController {

    @Autowired
    private SearchService service;

    @Autowired
    private SpiderService spiderService;

    @CrossOrigin("*")
    @RequestMapping( value= "api/search", method = RequestMethod.GET)
    public List<WebPage> search(@RequestParam Map<String, String> params) {
        // api/search?query=Download Windows&lang=en
        String query = params.get("query");
        return service.search(query);
    }

    @RequestMapping( value= "api/test", method = RequestMethod.GET)
    public String search() {
        return spiderService.indexWebPage();
    }
}
