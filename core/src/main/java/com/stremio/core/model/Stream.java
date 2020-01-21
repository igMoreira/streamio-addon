package com.stremio.core.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stream {
    @JsonIgnore
    private String videoId;
    private String title;
    private String url;
    private String yId;
    private String infoHash;
    private String fileIdx;
    private String externalUrl;
}
