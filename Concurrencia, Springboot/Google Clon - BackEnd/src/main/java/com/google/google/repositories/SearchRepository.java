package com.google.google.repositories;

import com.google.google.entities.WebPage;

import java.util.List;

public interface SearchRepository {

    WebPage getByUrl(String url);

    List<WebPage> getLinksToIndex();

    List<WebPage> search(String textSearch);

    void save(WebPage webPage);

    boolean exist(String link);
}