package com.stremio.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Manifest {
    private String id;
    private String name;
    private String version;
    private String description;
    private String logo;
    private List<String> resources;
    private List<String> types;
    private List<Catalog> catalogs;
}