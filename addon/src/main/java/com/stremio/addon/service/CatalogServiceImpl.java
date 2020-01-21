package com.stremio.addon.service;

import com.stremio.core.model.Catalog;
import com.stremio.core.model.MetaItem;
import com.stremio.core.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Override
    public List<Catalog> findAll() {
        return List.of(new Catalog("movieCatalog", "movie", "Hello, Movies", null));
    }

    @Override
    public Catalog findOne(String id) {
        Catalog catalog = new Catalog();
        catalog.setMetas(List.of(
                MetaItem.builder().id("tt0032138").type("movie").name("The Wizard of Oz").poster("https://images.metahub.space/poster/medium/tt0032138/img").genres(List.of("Adventure", "Family", "Fantasy", "Musical")).build(),
                MetaItem.builder().id("tt0017136").type("movie").name("Metropolis").poster("https://images.metahub.space/poster/medium/tt0017136/img").genres(List.of("Drama", "Sci-Fi")).build(),
                MetaItem.builder().id("hiwrld_jellyfish").type("movie").name("Jellyfish").poster("https://images.unsplash.com/photo-1496108493338-3b30de66f9be").genres(List.of("Demo", "Nature")).build()
        ));

        return catalog;
    }
}
