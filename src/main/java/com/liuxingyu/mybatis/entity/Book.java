package com.liuxingyu.mybatis.entity;

import java.io.PrintWriter;
import java.util.Date;

public class Book {
    private int id;
    private String name;
    private String author;
    private double price;
    private int tid;
    private String descri;
    private String photo;
    private Date pubDate;
    //定义关联属性
    private Type type;
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", tid=" + tid +
                ", descri='" + descri + '\'' +
                ", photo='" + photo + '\'' +
                ", pubDate=" + pubDate +
                ", type=" + type +
                '}';
    }

    public void setType(Type type) {
        this.type = type;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }



}
