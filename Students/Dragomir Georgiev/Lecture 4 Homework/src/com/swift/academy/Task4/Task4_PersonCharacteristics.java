package com.swift.academy.Task4;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.time.Year;
import java.util.Scanner;

public class Task4_PersonCharacteristics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Please enter the number of people: ");
        int count = sc.nextInt();

        while (count <= 0) {
            System.out.print("This is an invalid number of people. Please enter a number: ");
            count = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            System.out.print("Please enter your name: ");
            String firstName = sc.next();

            System.out.print("Please enter your last name: ");
            String lastName = sc.next();

            System.out.print("Please enter your gender: ");
            char gender = sc.next().charAt(0);

            System.out.print("Please enter the year you were born: ");
            short birthYear = sc.nextShort();
            int currentYear = Year.now().getValue();
            int age = currentYear - birthYear;

            System.out.print("Please enter your weight: ");
            double weight = sc.nextDouble();

            System.out.print("Please enter your height: ");
            short height = sc.nextShort();

            System.out.print("Please enter your profession: ");
            String profession = sc.next();

            System.out.print("Please enter your grades: ");

            double average = 0;
            int[] grades = new int [4];
            for(int j = 0; j < grades.length;j++){
                grades[j] = sc.nextInt();
            } for (int j = 0; j < grades.length; j++){
                average = average + grades[j];
            }


            System.out.printf("%s %s is %d years old. He was born in %d. His weight is %.2f and he is %d cm tall. He is a %s.", firstName, lastName, age, birthYear, weight, height, profession);

            if (age < 18) {
                System.out.println("He is under-aged");
            } else {
                System.out.println();
            }
        }


    }
}

