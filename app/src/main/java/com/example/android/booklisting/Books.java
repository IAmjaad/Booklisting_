package com.example.android.booklisting;

/**
 * Created by Amjaad on 8/26/2017.
 */

public class Books {

    private String title;
    private String authors;

    public Books(String title, String author) {
        this.title = title;
        this.authors = author;
    }

    public String getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

}
