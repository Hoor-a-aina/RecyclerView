package com.example.recyclerview;

public class FruitsModel {
    String fruitName;
    String fruitPrice;
    int image;

    FruitsModel(String fruitName,String fruitPrice,int image){
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
        this.image=image;
    }

    public String getFruitName() {
        return fruitName;
    }

    public String getFruitPrice() {
        return fruitPrice;
    }

    public int getImage() {
        return image;
    }
}
