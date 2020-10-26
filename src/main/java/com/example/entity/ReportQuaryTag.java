package com.example.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class ReportQuaryTag implements Serializable {

    private String start;
    private String end;
    private String firstScope;
    private String secondScope;
    private ArrayList<String> country;
    private String publisher;

    public ReportQuaryTag() {
        this.country = new ArrayList<String>();
    }

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

    public ArrayList<String> getCountry() {
        return country;
    }

    public void setCountry(ArrayList<String> countrys) {
        this.country.addAll(countrys);
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
