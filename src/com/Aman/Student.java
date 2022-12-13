package com.Aman;

import java.util.Scanner;
    public class Student extends RuntimeException {
        private String name;
        private int age;

        public <AgeDoesnotMatchException extends Throwable> Student(String name, int age) {
            try {
                if (age < 17 || age > 24) {
                    String msg = "Age is not between 17 and 24";
                    throw new AgeDoesnotMatchException(msg);
                }
            } catch (AgeDoesnotMatchException e) {
                e.printStackTrace();
            }
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("Name of the Student: " + this.name);
            System.out.println("Age of the Student: " + this.age);
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the Student: ");
            String name = sc.next();
            System.out.println("Enter the age of the Student should be 17 to 24 (including 17 and 24): ");
            int age = sc.nextInt();
            com.Aman.Student obj = new com.Aman.Student(name, age);
            obj.display();
        }
    }