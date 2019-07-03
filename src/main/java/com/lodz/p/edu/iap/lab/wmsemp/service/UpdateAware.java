package com.lodz.p.edu.iap.lab.wmsemp.service;

public interface UpdateAware<T> {

    void update(Long id, T object);
}
