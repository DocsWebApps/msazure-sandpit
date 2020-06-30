package com.docswebapps.msazuresandpit.web.rest;

import com.docswebapps.msazuresandpit.service.StorageContainerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/storage/container")
@Slf4j
public class StorageContainerRestController {
    private final StorageContainerService storageContainerService;

    public StorageContainerRestController(StorageContainerService storageContainerService) {
        this.storageContainerService = storageContainerService;
    }

    @PostMapping("/create")
    public void createNewContainer(@RequestParam("Name") String containerName) {
        log.info("StorageContainerRestController: createNewContainer() called with container name: {}", containerName);
        this.storageContainerService.createContainer(containerName);
    }
}
