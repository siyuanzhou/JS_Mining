package com.example.entity;

import java.io.Serializable;

/**
 * @author yuanhang
 * @Description
 * @date 2019-11-10 9:40
 */

public class Tag implements Serializable {
    public String first;
    public String second;
    public String country;
    public String time;

    public Tag() {
    }

    public Tag(String first, String second, String country, String time) {
        this.first = first;
        this.second = second;
        this.country = country;
        this.time = time;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return first + ':'+ second+ ':' +country + ':'+ time ;
    }
}
