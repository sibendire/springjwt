package com.securityapp.application.Studententity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;
@Entity
public class Library {
    @Id
    private Long id;
    private String name;
    private String bookName;
    private Date publication;
    private String bookAuthor;
    private Date bookTaken;
    private Date bookReturned;
    private List<Books> booksList;

    public Library() {

    }

    public Library(Long id, String name, String bookName, Date publication, String bookAuthor, Date bookTaken, Date bookReturned) {
        this.id = id;
        this.name = name;
        this.bookName = bookName;
        this.publication = publication;
        this.bookAuthor = bookAuthor;
        this.bookTaken = bookTaken;
        this.bookReturned = bookReturned;
        this.booksList = booksList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getPublication() {
        return publication;
    }

    public void setPublication(Date publication) {
        this.publication = publication;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public Date getBookTaken() {
        return bookTaken;
    }

    public void setBookTaken(Date bookTaken) {
        this.bookTaken = bookTaken;
    }

    public Date getBookReturned() {
        return bookReturned;
    }

    public void setBookReturned(Date bookReturned) {
        this.bookReturned = bookReturned;
    }
}
