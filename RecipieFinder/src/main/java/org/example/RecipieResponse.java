package org.example;

import java.util.ArrayList;

public class RecipieResponse {
    private int from;
    private int to;
    private int count;
    private ArrayList<Hit> hits = new ArrayList<>();

    public ArrayList<Hit> getHits() {
        return hits;
    }

    public void setHits(ArrayList<Hit> hits) {
        this.hits = hits;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }
}
