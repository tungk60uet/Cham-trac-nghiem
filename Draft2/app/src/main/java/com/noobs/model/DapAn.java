package com.noobs.model;

import java.util.ArrayList;

/**
 * Created by SUNFLOWER on 3/7/2017.
 */

public class DapAn {
    private int ma_de;
    private String cautraloi;

    public DapAn() {
    }

    public DapAn(int ma_de, String cautraloi) {
        this.ma_de = ma_de;
        this.cautraloi = cautraloi;
    }

    public int getMa_de() {
        return ma_de;
    }

    public void setMa_de(int ma_de) {
        this.ma_de = ma_de;
    }

    public String getCautraloi() {
        return cautraloi;
    }

    public void setCautraloi(String cautraloi) {
        this.cautraloi = cautraloi;
    }
}
