package com.discover.harmony.elastic.load;

import com.discover.harmony.elastic.model.BusinessMetadata;
import com.discover.harmony.elastic.repository.BusinessMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    BusinessMetadataRepository businessMetadataRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){

        operations.putMapping(BusinessMetadata.class);
        System.out.println("Loading Data");
        businessMetadataRepository.save(getData());
        System.out.printf("Loading Completed");

    }

    private List<BusinessMetadata> getData() {
        List<BusinessMetadata> metadata = new ArrayList<>();
        metadata.add(new BusinessMetadata((long)1,"TradeLine"));
        metadata.add(new BusinessMetadata((long)2,"Credit Line"));
        metadata.add(new BusinessMetadata((long)3,"Other Line"));

        return metadata;
    }
}
