package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws FileNotFoundException {
	// write your code here



        Array numbers = new Array(1);
        numbers.insert(4);
        numbers.insert(6);
        System.out.println(numbers.indexOf(4));
        numbers.print();

        //ArrayList
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.remove(1);
        list.size();
        list.contains(10);
        list.toArray();    //covert to array
        System.out.println(list);

        //LinkedList can grow and shrink automatically
        LinkedList link = new LinkedList();
        link.add(10);
        link.add(20);
        System.out.println(link);


    }



}
