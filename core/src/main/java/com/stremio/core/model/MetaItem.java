package com.stremio.core.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetaItem {
    private String id;
    private String type;
    private String name;
    private String poster;
    private List<String> genres;
    private String description;
    private List<String> cast;
    private List<String> director;
    private String logo;
    private String background;
    private String runtime;
    private List<Stream> streams;
    private MetaItem meta;
}
