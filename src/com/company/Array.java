package com.company;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
    }

    public void insert(int item) {
        //if the array is full need to resize it
        if(items.length == count) {
             //create a new array of twice the size
            int[] newItems = new int[count*2];
            //copy the items to the new array
            for(int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            //set the items to the array
            items = newItems;
        }
        //add the new item at the end of the array
        this.items[count++] = item;

    }

    public void remove(int index) {
        //validate the index in the right range
        if (index < 0 || index >=count)
            throw new IllegalArgumentException();
        //shift the items to the left to fill the hole
        for (int i = index; i < count; i++) {
            items[i] = items[i+1];
            count--;
        }
    }

    public int indexOf(int item) {
        //if we find the item return the index
        for(int i = 0; i<count; i++) {
            if(item==items[i]) {
                return i;
            }
        }
        //otherwise return -1
        return -1;
    }

    public void print() {
        for (int i=0; i<count; i++) {
            System.out.println(items[i]);
        }
    }
}
