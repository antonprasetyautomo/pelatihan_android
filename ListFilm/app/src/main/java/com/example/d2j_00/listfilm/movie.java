package com.example.d2j_00.listfilm;

import java.io.Serializable;

/**
 * Created by D2J-00 on 09/02/2017.
 */
public class movie implements Serializable{
    public String title;
    public String description;
    public double rating;
    public int years;

    public movie(String title, String description, double rating, int years) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.years = years;
    }

    @Override
    public String toString(){
        return this.title;
    }
}
