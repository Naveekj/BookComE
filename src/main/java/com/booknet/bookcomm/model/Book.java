package com.booknet.bookcomm.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {

    private String title;
    private String authors;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
