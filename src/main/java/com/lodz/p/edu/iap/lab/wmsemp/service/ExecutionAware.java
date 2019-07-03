package com.lodz.p.edu.iap.lab.wmsemp.service;

public interface ExecutionAware<T> {

    void execute(T object);
}
