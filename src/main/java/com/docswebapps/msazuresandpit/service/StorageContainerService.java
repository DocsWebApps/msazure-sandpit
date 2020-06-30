package com.docswebapps.msazuresandpit.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StorageContainerService {
//    @Value("${docswebapps.azure.sas-token}")
//    String sasToken;
//
//    @Value("${docswebapps.azure.blob_sas_url}")
//    String blobSasUrl;

    public StorageContainerService() {}

//    public void createContainer(String containerName) {
//        log.info("StorageContainerService: createContainer() called with container name: {}", containerName);
//
//        BlobContainerClient containerClient = null;
//
//        // Create a new BlobServiceClient with a SAS Token */
//        log.info(sasToken);
//        log.info(blobSasUrl);
//        BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
//                .endpoint(blobSasUrl)
//                .sasToken(sasToken)
//                .buildClient();
//
//        // Create a new container client */
//        try {
//            containerClient = blobServiceClient.createBlobContainer("my-container-name");
//        } catch (BlobStorageException ex) {
//            // The container may already exist, so don't throw an error
//            if (!ex.getErrorCode().equals(BlobErrorCode.CONTAINER_ALREADY_EXISTS)) {
//                throw ex;
//            }
//        }
//    }

}
