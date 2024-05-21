package com.libreria.web.service.impl;

import com.libreria.web.dto.BookDto;
import com.libreria.web.model.Book;
import com.libreria.web.repository.BookRepository;
import com.libreria.web.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDto> findAllBooks()
    {
        List<Book> books = bookRepository.findAll();
        return books.stream().map((book) -> mapToBookDto(book)).collect(Collectors.toList());
    }

    private BookDto mapToBookDto (Book book)
    {
        BookDto bookDto = BookDto.builder()
                .bookID(book.getBookID())
                .bookTitle(book.getBookTitle())
                .bookGenre(book.getBookGenre())
                .bookDescription(book.getBookDescription())
                .author(book.getAuthor())
                .bookCover(book.getBookCover())
                .fileName(book.getFileName())
                .createdOn(book.getCreatedOn())
                .updatedOn(book.getUpdatedOn())
                .build();
        return bookDto;
    }
}
