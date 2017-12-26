package com.discover.harmony.elastic.model;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "bsn", type = "mtd", shards = 1)
public class BusinessMetadata {

    private Long id;
    private String name;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BusinessMetadata(Long id, String name) {

        this.id = id;
        this.name = name;
    }

    public BusinessMetadata() {

    }
}

