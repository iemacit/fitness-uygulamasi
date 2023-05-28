package com.example.fitnessuygulamasi;

import java.util.ArrayList;

public class FoodLis {
    private ArrayList<Food> foodList = new ArrayList<>();

    public FoodLis(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }


    public FoodLis() {
    }


    public ArrayList<Food> getWordList() {
        return foodList;
    }

    public void setWordList(ArrayList<Food> denemeArrayList) {
        this.foodList = denemeArrayList;
    }
}
