package com.docswebapps.msazuresandpit.web.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.charset.Charset;

@RestController
@RequestMapping("/examples")
@Slf4j
public class ReadWriteFileController {
    /*
        This is an example of how to read/write to a resource on the web.
        This could be any readable/writeable resource and not necessary an Azure resource
     */

    @Value("${azuretextfile1}")
    private Resource blobFile1;

    @GetMapping("/read")
    public String readBlobFile() throws IOException {
        log.info("Read file example");
        return StreamUtils.copyToString(
                this.blobFile1.getInputStream(),
                Charset.defaultCharset());
    }

    @PostMapping("/write")
    public String writeBlobFile(@RequestBody String data) throws IOException {
        log.info("Write file example");
        // Write code here
        return "File was updated";
    }
}
