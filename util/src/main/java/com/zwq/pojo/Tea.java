package com.zwq.pojo;

public class Tea {
    private Integer id;

    private String name;

    private Long price;

    private Short stocks;

    private String img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Short getStocks() {
        return stocks;
    }

    public void setStocks(Short stocks) {
        this.stocks = stocks;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }
}