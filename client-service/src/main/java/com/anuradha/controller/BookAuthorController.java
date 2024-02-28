package com.anuradha.controller;

import com.anuradha.service.BookAuthorService;
import com.google.protobuf.Descriptors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Hello world!
 */
@RestController
public class BookAuthorController {

    @Autowired
    private BookAuthorService bookAuthorService;

    @GetMapping("/author/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getAuthor(@PathVariable int id) {
        return bookAuthorService.getAuthor(id);
    }

}
