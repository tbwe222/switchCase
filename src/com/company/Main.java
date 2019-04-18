package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of days in a month(29, 30, 31)");
        int day = scan.nextInt();
        String monthName;
        switch (day) {
            case 30:
                monthName = "September, April, June, November";
                break;
            case 31:
                monthName = "January, February, March, May, July, August, October, December ";
                break;
            case 29:
                monthName = "February";
                break;
            default:
                monthName = "no months have exactly " + day + " days";
                break;
        }
        System.out.println(monthName);
    }
}
