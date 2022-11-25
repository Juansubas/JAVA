package com.google.google.controllers;

import com.google.google.entities.WebPage;
import com.google.google.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class SearchController {

    @Autowired
    private SearchService service;

    @CrossOrigin("*")
    @RequestMapping( value= "api/search", method = RequestMethod.GET)
    public List<WebPage> search(@RequestParam Map<String, String> params) {
        // api/search?query=Download Windows&lang=en
        String query = params.get("query");
        return service.search(query);
    }
}
