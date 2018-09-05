package io.github.rxcats.swagger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Api(value = "/api", description = "swagger api documentation demo")
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@RestController
public class BookController {

    final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @ApiOperation(value = "get books", response = Book.class, responseContainer = "List")
    @ApiResponses({
        @ApiResponse(code = 200, message = "ok")
    })
    @GetMapping("/books")
    public ServerResponseEntity books() {
        return ServerResponseEntity.of(bookRepository.getBooks());
    }

}
