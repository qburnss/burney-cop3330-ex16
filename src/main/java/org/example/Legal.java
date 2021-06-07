/*
 *  UCF COP3330 Summer 2021 Assignment 16 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

public class Legal {
    public static void main(String[] args){
        int age;
        System.out.println("What is your age?");
        Scanner scanner = new Scanner(System.in);
        String rage = scanner.next();
        age = Integer.parseInt(rage);
        if(age <= 15){
            System.out.println("You are not old enough to legally drive.");
        }
        else{
            System.out.println("You are old enough to legally drive.");
        }
    }
}
