package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here

        Scanner in = new Scanner(new File("test.txt"));
        while(in.hasNextLine()) {
            System.out.println(in.nextLine());
        }


    }
}
