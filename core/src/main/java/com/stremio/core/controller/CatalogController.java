package com.stremio.core.controller;

import com.stremio.core.model.Catalog;
import com.stremio.core.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog")
@CrossOrigin
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping("/{type}/{id}")
    public ResponseEntity<Catalog> getContent(@PathVariable String type, @PathVariable String id) {
        return ResponseEntity.ok(service.findOne(id));
    }
}
