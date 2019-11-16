package com.donggeon.honmaker.extension.Retrofit;

import com.google.gson.annotations.SerializedName;

public class FoodRating {
    
    @SerializedName("uid")
    String uid;
    
    @SerializedName("food")
    String food;
    
    @SerializedName("ratio")
    float rating;
    
    public FoodRating(String uid, String food, float rating) {
        this.uid = uid;
        this.food = food;
        this.rating = rating;
    }
    
    public String getUid() {
        return uid;
    }
    
    public void setUid(String uid) {
        this.uid = uid;
    }
    
    public String getFood() {
        return food;
    }
    
    public void setFood(String food) {
        this.food = food;
    }
    
    public float getRating() {
        return rating;
    }
    
    public void setRating(float rating) {
        this.rating = rating;
    }
}
