package com.acecademy.temp;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.List;


@ToString
@AllArgsConstructor
public class FeedService {

    private final List<String> files;

    public List<String> getFiles() {
        return files;
    }
}
