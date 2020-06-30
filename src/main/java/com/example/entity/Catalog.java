package com.example.entity;

import java.io.Serializable;
import java.util.List;

public class Catalog implements Serializable {

    private List<String>catalog1;
    private List<String>catalog2;
    private List<String>catalog3;
    private List<String>catalog4;

    public List<String> getCatalog1() {
        return catalog1;
    }

    public void setCatalog1(List<String> catalog1) {
        this.catalog1 = catalog1;
    }

    public List<String> getCatalog2() {
        return catalog2;
    }

    public void setCatalog2(List<String> catalog2) {
        this.catalog2 = catalog2;
    }

    public List<String> getCatalog3() {
        return catalog3;
    }

    public void setCatalog3(List<String> catalog3) {
        this.catalog3 = catalog3;
    }

    public List<String> getCatalog4() {
        return catalog4;
    }

    public void setCatalog4(List<String> catalog4) {
        this.catalog4 = catalog4;
    }
}
