package com.example.entity;

import io.searchbox.annotations.JestId;

import java.io.Serializable;

public class Weapon implements Serializable {
    @JestId
    private double id;
    private String first;
    private String name;
    private String country;
    private String second;
    private String time;
    private String img_url;
    private String img_desc;
    private String detail_url;
    private String img_detail_url;

    public Weapon(){

    }
    public Weapon(double id, String first, String name, String country, String second, String time, String img_url, String img_desc, String detail_url, String img_detail_url) {
        this.id = id;
        this.first = first;
        this.name = name;
        this.country = country;
        this.second = second;
        this.time = time;
        this.img_url = img_url;
        this.img_desc = img_desc;
        this.detail_url = detail_url;
        this.img_detail_url = img_detail_url;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getImg_desc() {
        return img_desc;
    }

    public void setImg_desc(String img_desc) {
        this.img_desc = img_desc;
    }

    public String getDetail_url() {
        return detail_url;
    }

    public void setDetail_url(String detail_url) {
        this.detail_url = detail_url;
    }

    public String getImg_detail_url() {
        return img_detail_url;
    }

    public void setImg_detail_url(String img_detail_url) {
        this.img_detail_url = img_detail_url;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "id=" + id +
                ", first='" + first + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", second='" + second + '\'' +
                ", time='" + time + '\'' +
                ", img_url='" + img_url + '\'' +
                ", img_desc='" + img_desc + '\'' +
                ", detail_url='" + detail_url + '\'' +
                ", img_detail_url='" + img_detail_url + '\'' +
                '}';
    }
}
