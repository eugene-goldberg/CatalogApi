package com.discover.harmony.elastic.repository;

import com.discover.harmony.elastic.model.BusinessMetadata;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BusinessMetadataRepository extends ElasticsearchRepository<BusinessMetadata, Long> {
    List<BusinessMetadata> findByName(String name);

    List<BusinessMetadata> findById(Long id);

}
