package com.klb.fileservice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Podstawowy serwis z operacjami na pliku
 */
public class FileAccessService {
    private String path;  //sciezka do pliku

    public FileAccessService(String path) {
        this.path = path;
    }
    //zwraca liste liniiz pliku
    public List<String> load() throws IOException {
        return Files.readAllLines(Paths.get(path));
    }
}
