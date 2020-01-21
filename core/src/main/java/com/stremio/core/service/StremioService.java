package com.stremio.core.service;

import java.util.List;

public interface StremioService<T, E> {
    List<T> findAll();

    T findOne(E id);
}
