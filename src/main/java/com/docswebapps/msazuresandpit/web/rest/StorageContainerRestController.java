package com.docswebapps.msazuresandpit.web.rest;

import com.docswebapps.msazuresandpit.service.StorageContainerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.Charset;

@RestController
@RequestMapping("/api/v1/storage/container")
@Slf4j
public class StorageContainerRestController {
    private final StorageContainerService storageContainerService;

    @Value("${azureimageblob}")
    private Resource blobFile;

    public StorageContainerRestController(StorageContainerService storageContainerService) {
        this.storageContainerService = storageContainerService;
    }

//    @PostMapping("/create")
//    public void createNewContainer(@RequestParam("Name") String containerName) {
//        log.info("StorageContainerRestController: createNewContainer() called with container name: {}", containerName);
//        this.storageContainerService.createContainer(containerName);
//    }


    @GetMapping("/public-images/azure")
    public String readBlobFile() throws IOException {
        return StreamUtils.copyToString(
                this.blobFile.getInputStream(),
                Charset.defaultCharset());
    }

//    @PostMapping
//    public String writeBlobFile(@RequestBody String data) throws IOException {
//        try (OutputStream os = ((WritableResource) this.blobFile).getOutputStream()) {
//            os.write(data.getBytes());
//        }
//        return "file was updated";
//    }
}
