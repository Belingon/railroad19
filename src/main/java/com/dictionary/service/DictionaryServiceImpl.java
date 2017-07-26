package com.dictionary.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Override
    public Boolean checkSpelling(String userWord) {

        List<String> dictionaryResult = new ArrayList<>();
        String fileName =
                "C:/Users/courtland.parker/certManager/certManager2/railroad19/src/main/resources/US.dic";

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            dictionaryResult =
                    stream.filter(wrd -> wrd.equals(userWord)).collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dictionaryResult.isEmpty();
    }

}
