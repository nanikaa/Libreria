package com.libreria.web.service;

import com.libreria.web.dto.BookDto;
import java.util.List;

public interface BookService {
    List<BookDto> findAllBooks();
}
