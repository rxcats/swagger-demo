package io.github.rxcats.swagger.controller;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Book {

    String isbn;

    String title;

    String author;

    Gender gender;

}
