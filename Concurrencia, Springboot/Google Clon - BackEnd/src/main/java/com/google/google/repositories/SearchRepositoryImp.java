package com.google.google.repositories;

import com.google.google.entities.WebPage;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class SearchRepositoryImp implements SearchRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public List<WebPage> search(String textSearch) {
        String query = "FROM webpage WHERE description like :textSearch";

        return entityManager.createQuery(query)
                .setParameter("textSearch", "%"+ textSearch +"%")
                .getResultList();
    }
}
