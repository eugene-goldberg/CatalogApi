package com.discover.harmony.elastic.resource;

import com.discover.harmony.elastic.model.BusinessMetadata;
import com.discover.harmony.elastic.repository.BusinessMetadataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/save")
public class SaveResource {

    @Autowired
    BusinessMetadataRepository businessMetadataRepository;
    //@RequestMapping(value = "/rest/save", method = RequestMethod.POST)
//    @PostMapping(value = "/name/{text}")
//    public void Save(String text) {
//        businessMetadataRepository.save(new BusinessMetadata((long)99, text));
//    }

    @PostMapping("/name/{text}")
    public void Save(@PathVariable String text) {
        BusinessMetadata mtd = businessMetadataRepository.save(new BusinessMetadata(text));
    }
}
