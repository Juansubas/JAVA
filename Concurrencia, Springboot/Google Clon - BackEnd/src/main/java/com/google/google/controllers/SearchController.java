package com.google.google.controllers;

import com.google.google.entities.WebPage;
import com.google.google.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SearchController {

    @Autowired
    private SearchService service;

    @RequestMapping( value= "api/search", method = RequestMethod.GET)
    public List<WebPage> search(Strign textSearch) {
        return service.search(textSearch);
    }
}
