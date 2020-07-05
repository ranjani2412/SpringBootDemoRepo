package com.sample.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    /*
        We are returning a LIST here. The dependency starter-json takes care of convering the response from Object to Json
    */
    @GetMapping("/book")
    public List<Book> getAllRegisteredBooks() {
        return Arrays.asList(new Book("B1001", "Mastering Spring", "John Doe", 1000),
                new Book("B1002", "Be a SpringBoot Expert in 100 Steps", "Claire Beaver", 766),
                new Book("B1003", "Be a SpringBoot Expert", "Johny Cho", 444));
    }
}
