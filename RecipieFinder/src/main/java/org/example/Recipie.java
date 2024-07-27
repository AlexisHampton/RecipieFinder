package org.example;

import java.util.ArrayList;

public class Recipie {
    private String label;
    private String image;
    private String url;
    private float yield;
    private float calories;
    private ArrayList<String> ingredientLines = new ArrayList<>();

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getYield() {
        return yield;
    }

    public void setYield(float yield) {
        this.yield = yield;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }


    public ArrayList<String> getIngredientLines() {
        return ingredientLines;
    }

    public void setIngredientLines(ArrayList<String> ingredientLines) {
        this.ingredientLines = ingredientLines;
    }

    public String stringifyIngredientLines() {
        String lines = "";
        for(int i = 0; i < ingredientLines.size(); i++){
            lines += ingredientLines.get(i) + "\n";
        }
        return lines;
    }

}
