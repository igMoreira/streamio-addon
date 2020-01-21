package com.stremio.core.controller;

import com.stremio.core.model.MetaItem;
import com.stremio.core.service.MetaItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class MetaController {

    @Autowired
    private MetaItemService service;

    @GetMapping("/meta/{type}/{id}")
    public ResponseEntity<MetaItem> getMeta(@PathVariable String type, @PathVariable String id) {
        return ResponseEntity.ok(service.findOne(id));
    }

    @GetMapping("/stream/{type}/{videoId}")
    public ResponseEntity<MetaItem> getStream(@PathVariable String type, @PathVariable String videoId) {
        return ResponseEntity.ok(service.findStreams(videoId));
    }
}
