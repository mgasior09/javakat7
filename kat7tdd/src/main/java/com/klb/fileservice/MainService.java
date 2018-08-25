package com.klb.fileservice;

import java.io.IOException;
import java.util.List;

/**
 * Rozszerzony serwis z operacjami na pliku
 *
 * Tą klasę będziemy testować
 */
public class MainService {
    private FileAccessService fileAccessService;

    public MainService(FileAccessService fileAccessService) {
        this.fileAccessService = fileAccessService;
    }

    public List<String> loadFile() throws IOException {
        return fileAccessService.load();
    }
    //zwraca liczbe linii z pliku
    public int numOfLines() throws IOException {
        return fileAccessService.load().size();
    }
}
