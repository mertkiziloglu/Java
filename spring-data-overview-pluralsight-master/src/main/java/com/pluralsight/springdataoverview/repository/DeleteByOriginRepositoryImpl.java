package com.pluralsight.springdataoverview.repository;

import javax.persistence.EntityManager;

public class DeleteByOriginRepositoryImpl implements DeleteByOriginRepository {

    private final EntityManager entityManager;

    public DeleteByOriginRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void deleteByOrigin(String origin) {
        entityManager.createNativeQuery("DELETE from flight WHERE origin = ?")
            .setParameter(1, origin)
            .executeUpdate();
    }

    @Override
    public void addByOrigin(String origin) {
        entityManager.createNativeQuery("INSERT INTO flight (origin) VALUES (?)")
            .setParameter(1, origin)
            .executeUpdate();
    }
}
