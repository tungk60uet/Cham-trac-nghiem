package com.noobs.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by SUNFLOWER on 3/7/2017.
 */

public class BoDapAn implements Serializable{
    private String name;
    private ArrayList<DapAn> dsDapAn;

    public BoDapAn() {
    }

    public BoDapAn(String name, ArrayList<DapAn> dsDapAn) {
        this.name = name;
        this.dsDapAn = dsDapAn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<DapAn> getDsDapAn() {
        return dsDapAn;
    }

    public void setDsDapAn(ArrayList<DapAn> dsDapAn) {
        this.dsDapAn = dsDapAn;
    }
}
