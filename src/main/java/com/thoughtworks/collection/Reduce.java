package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        return this.arrayList.stream()
                .mapToDouble(Integer::intValue).average().getAsDouble();
    }

    public int getMaxValue() {

        return this.arrayList.stream().mapToInt(Integer::intValue).max().getAsInt();
    }

    public int getLastOdd() {
        return this.arrayList.stream().filter(item->item%2>0).reduce(0,(x,y)->y);
    }
}
