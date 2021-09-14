/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;


public class Main {
        public String Nummonth(int month){
            switch (month) {
                case 1:
                    return "January";
                case 2:
                    return "Febuary";
                case 3:
                    return "March";
                case 4:
                    return "April";
                case 5:
                    return "May";
                case 6:
                    return "June";
                case 7:
                    return "July";
                case 8:
                    return "August";
                case 9:
                    return "September";
                case 10:
                    return "October";
                case 11:
                    return "November";
                case 12:
                    return "December";
                default:
                    return "error";
            }
        }


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            Main number = new Main();

            System.out.print("Please enter the number of month: ");
            int month = input.nextInt();

            String result = number.Nummonth(month);
            if(month>0 && month<12)
                System.out.println("The name of the month is "+result);
            else
                System.out.println("Incorrect month");

        }
    }
