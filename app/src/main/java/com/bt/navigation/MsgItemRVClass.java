package com.bt.navigation;

import java.util.ArrayList;

public class MsgItemRVClass {
    int img;
    String mess,name,date;

    public MsgItemRVClass(int img, String mess, String name, String date) {
        this.img = img;
        this.mess = mess;
        this.name = name;
        this.date = date;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public static ArrayList<MsgItemRVClass> initData(int[] imageList, String[] mess, String[] name , String[] date) {

        ArrayList<MsgItemRVClass> arrList = new ArrayList<>();

        for (int i = 0; i < date.length; i++) {
            MsgItemRVClass item = new MsgItemRVClass(imageList[i], mess[i], name[i],date[i]);
            arrList.add(item);
        }
        return arrList;
    }


}
