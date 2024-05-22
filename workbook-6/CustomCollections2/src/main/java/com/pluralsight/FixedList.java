package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T> {
    private List<T> items;
    private int maxSize;
    public FixedList(int maxSize){
        this.maxSize = maxSize;
         items = new ArrayList<T>();
    }
    public void add(T item){
        if (items.size() < maxSize){
            items.add(item);
        } else if(items.size() == maxSize){
            System.out.println("Cannot add "+ item+ ", List Full");
        }
    }

    public List<T> getItems() {

        return items;
    }
}
