package com.anuradha;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class TempDB {

    // create two static mechods to random authors data list and random books data list
    public static List<Author> getAuthors() {
        List<Author> authors = new ArrayList<>();
        authors.add(Author.newBuilder().setAuthorId(1).setName("Anuradha").setEmail("anuradha@gmail.com").setBio("Super rude").build());
        authors.add(Author.newBuilder().setAuthorId(2).setName("Saman").setEmail("test@gmail.com").setBio("Super good").build());
        authors.add(Author.newBuilder().setAuthorId(3).setName("Kamal").setEmail("test@gmail.com").setBio("Super bad").build());
        authors.add(Author.newBuilder().setAuthorId(4).setName("Sunil").setEmail("test@gmail.com").setBio("Super naughty").build());
        authors.add(Author.newBuilder().setAuthorId(5).setName("Nimal").setEmail("test@gmail.com").setBio("Super talented").build());
        return authors;
    }

    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(Book.newBuilder().setBookId(1).setTitle("Java").setAuthor("Anuradha").setAvailable(true).build());
        books.add(Book.newBuilder().setBookId(2).setTitle("C++").setAuthor("Saman").setAvailable(true).build());
        books.add(Book.newBuilder().setBookId(3).setTitle("Python").setAuthor("Kamal").setAvailable(false).build());
        books.add(Book.newBuilder().setBookId(4).setTitle("C#").setAuthor("Sunil").setAvailable(true).build());
        books.add(Book.newBuilder().setBookId(5).setTitle("Ruby").setAuthor("Nimal").setAvailable(true).build());
        return books;
    }


}
