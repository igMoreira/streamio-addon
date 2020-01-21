package com.stremio.core.service;

import com.stremio.core.model.MetaItem;

import java.util.List;

public interface MetaItemService extends StremioService<MetaItem, String> {
    default List<MetaItem> findAll() {
        throw new UnsupportedOperationException("Not implemented");
    }

    MetaItem findStreams(String videoId);
}
