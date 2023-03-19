package com.example.practice12.components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class HashCoder {

    @Autowired
    private ApplicationArguments applicationArguments;

    @Value("#{springApplicationArguments.nonOptionArgs[0]}")
    private String inputFilePath;

    @Value("#{springApplicationArguments.nonOptionArgs[1]}")
    private String hashFilePath;

    @PostConstruct
    public void init() throws IOException {
        String data = null;
        try {
            data = new String(Files.readAllBytes(Path.of(inputFilePath)));
        } catch (IOException e) {
            data = null;
        } finally {
            File file = new File(hashFilePath);
            FileWriter writer = new FileWriter(file);
            writer.write(data == null ? "null" : data.hashCode() + "");
            writer.flush();
            writer.close();
        }

    }

    @PreDestroy
    public void destroy() {
        if (Files.exists(Path.of(inputFilePath))) {
            File file = new File(inputFilePath);
            file.delete();
        }

    }
}
