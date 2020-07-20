package com.example.entity;

import java.io.Serializable;

public class ReportQuaryTag implements Serializable {

    private String start;
    private String end;
    private String firstScope;
    private String secondScope;
    private String country;
    private String publisher;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getFirstScope() {
        return firstScope;
    }

    public void setFirstScope(String firstScope) {
        this.firstScope = firstScope;
    }

    public String getSecondScope() {
        return secondScope;
    }

    public void setSecondScope(String secondScope) {
        this.secondScope = secondScope;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "ReportQuaryTag{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", firstScope='" + firstScope + '\'' +
                ", secondScope='" + secondScope + '\'' +
                ", country='" + country + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
