package com.libreria.web.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BookDto {
    private Long bookID;
    private String bookTitle;
    private String bookGenre;
    private String bookDescription;
    private String author;
    private String bookCover;
    private String  fileName;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}
