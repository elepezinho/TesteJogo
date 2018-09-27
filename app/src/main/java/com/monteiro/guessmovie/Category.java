package com.monteiro.guessmovie;

public class Category {

    private String name;
    private int level;
    private int total;
    private int image;

    public Category() {
    }

    public Category(String name, int image, int level, int total) {
        this.name = name;
        this.image = image;
        this.level = level;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "" + this.name;
    }
}
