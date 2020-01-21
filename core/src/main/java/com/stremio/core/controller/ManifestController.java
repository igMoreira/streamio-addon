package com.stremio.core.controller;

import com.stremio.core.model.Manifest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ManifestController {

    @Autowired
    private Manifest manifest;

    @RequestMapping("/manifest")
    public ResponseEntity<Manifest> getManifest() {
        return ResponseEntity.ok(manifest);
    }
}
