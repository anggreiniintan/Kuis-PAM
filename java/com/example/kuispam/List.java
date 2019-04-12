package com.example.kuispam;

public class List {
    private String head;
    private String des;
    private int imageS;



    public List(int imageS, String head, String des) {
        this.head = head;
        this.des = des;
        this.imageS = imageS;
    }
    public int getImageS() {
        return imageS;
    }

    public String getHead() {
        return head;
    }

    public String getDes() {
        return des;
    }


}
