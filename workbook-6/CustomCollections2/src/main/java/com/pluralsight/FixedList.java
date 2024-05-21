package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T> {
    private List<T> items = new ArrayList<T>();
    private int maxSize;
    public FixedList(int maxSize){
        this.maxSize = 4;
    }
    public void add(T item){
        if (items.size() < maxSize){
            add(item);
        } else if(items.size() == maxSize){
            System.out.println("Cannot add "+ item+ ", List Full");
        }
    }

    public List<T> getItems() {
        return items;
    }
}
