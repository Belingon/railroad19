package com.dictionary.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dictionary.service.DictionaryServiceImpl;

@RestController
public class DictionaryController {
    
    private DictionaryServiceImpl dictionaryService;
    
    @Inject
    public DictionaryController(final DictionaryServiceImpl dictionaryService){
        this.dictionaryService = dictionaryService;
    }
    
    @RequestMapping(value= "/dictionary/{word}/spelling", method = RequestMethod.GET)
    public ResponseEntity<Object> checkSpelling (@PathVariable("word") String incomingWord){
        
        String userWord = incomingWord;
        
        if(dictionaryService.checkSpelling(userWord)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
