package com.google.google.repositories;

import com.google.google.entities.WebPage;

import java.util.List;

public interface SearchRepository {

    public List<WebPage> search (String textSearch);

    void save(WebPage webPage);
}
