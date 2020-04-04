package com.example.cydbooks;

public class CategoryItem {
    private String title;
    private String author;
    private String summary;
    private String genre;
    private int bookcover;

    public CategoryItem(String title, String author, String summary, String genre, int bookcover) {
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.genre = genre;
        this.bookcover = bookcover;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSummary() {
        return summary;
    }

    public String getGenre() {
        return genre;
    }

    public int getBookcover() {
        return bookcover;
    }
}
