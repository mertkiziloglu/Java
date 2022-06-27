package com.pluralsight.springdataoverview.repository;

public interface DeleteByOriginRepository {
    void deleteByOrigin(String origin);

    void addByOrigin(String origin);
}
