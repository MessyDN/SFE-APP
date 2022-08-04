package com.example.truegg;

import java.io.Serializable;

public class Foods implements Serializable {

    private String FoodName, recDate;
    private int calories, foodID;
    private static final long serialVersionID = 10l;


    public Foods() {
    }


    public Foods(String FoodName, String recDate, int calories, int foodID){
        this.FoodName = FoodName;
        this.recDate = recDate;
        this.calories = calories;
        this.foodID = foodID;

    }


    public void setFoodName(String FoodName){
        this.FoodName = FoodName;
    }
    public String getFoodName(){
        return FoodName;
    }

    public void setRecDate(String recDate){
        this.recDate = recDate;
    }
    public String getRecDate(){
        return recDate;
    }


    public void setCalories(int calories){
        this.calories = calories;
    }
    public int getCalories(){
        return calories;
    }

    public void setFoodID(int foodID){this.foodID = foodID;}
    public int getFoodID(){
        return foodID;
    }



}

