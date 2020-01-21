package com.stremio.core.config;

import com.stremio.core.model.Catalog;
import com.stremio.core.model.Manifest;
import com.stremio.core.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class ManifestConfig {

    @Autowired
    CatalogService catalogService;

    @Bean
    @ConfigurationProperties("stremio.manifest")
    public Manifest manifest() {
        Manifest manifest = new Manifest();
        List<Catalog> catalogs = catalogService.findAll();
        List<String> types = catalogs.stream()
                .map(Catalog::getType)
                .distinct()
                .collect(Collectors.toList());
        manifest.setCatalogs(catalogs);
        manifest.setTypes(types);
        return manifest;
    }
}
