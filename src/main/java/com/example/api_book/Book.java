package com.example.api_book;

public class Book
{
    private String title;
    private String author;
    private String id;

    public Book() {}

    public Book(String title, String author,String id) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    //setters and getters
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
}
