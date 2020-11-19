package com.example.entity;

public class FieldBean {
    public String id;
    public String content;
    public String title;
    public String date;
    public String prec;
    public String recall;
    public String field;
    public String oldprecision;
    public String oldrecall;

    public String getOldprecision() {
        return oldprecision;
    }

    public void setOldprecision(String oldprecision) {
        this.oldprecision = oldprecision;
    }

    public String getOldrecall() {
        return oldrecall;
    }

    public void setOldrecall(String oldrecall) {
        this.oldrecall = oldrecall;
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrec() {
        return prec;
    }

    public void setPrec(String prec) {
        this.prec = prec;
    }

    public String getRecall() {
        return recall;
    }

    public void setRecall(String recall) {
        this.recall = recall;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
