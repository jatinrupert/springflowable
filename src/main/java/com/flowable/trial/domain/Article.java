package com.flowable.trial.domain;

public class Article {

    private String id;

    private String author;

    private String url;

    public Article(String id, String author, String url) {
        this.author = author;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public String getUrl() {
        return url;
    }
}
