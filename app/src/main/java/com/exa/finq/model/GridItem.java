package com.exa.finq.model;

import android.graphics.drawable.Drawable;

/**
 * Created by root on 2/6/17.
 */

public class GridItem {

    String name;
    Integer photo;

    public GridItem(String name, Integer photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }
}
