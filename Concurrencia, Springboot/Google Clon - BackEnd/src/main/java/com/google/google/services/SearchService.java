package com.google.google.services;

import com.google.google.entities.WebPage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    public List<WebPage> search(Strign textSearch) {
        List<WebPage> result = new ArrayList<>();
        WebPage page = new WebPage();
        page.setTitle("test");
        page.setDescription("test");
        result.add(page);
        return result;
    }
}
