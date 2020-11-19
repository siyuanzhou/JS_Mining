package com.example.entity;

import java.io.Serializable;

public class Article implements Serializable {
    public String id;
    public String content;
    public String name;
    public String publisher;
    public String url;
    public String date;
    public String country;
    public String realScope;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRealScope() {
        return realScope;
    }

    public void setRealScope(String realScope) {
        this.realScope = realScope;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", url='" + url + '\'' +
                ", date='" + date + '\'' +
                ", country='" + country + '\'' +
                ", realScope='" + realScope + '\'' +
                '}';
    }
}
