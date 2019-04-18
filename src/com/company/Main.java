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
//        String monthName;
//        switch (month) {
//            case 1:  monthName = "January";
//                break;
//            case 2:  monthName = "February";
//                break;
//            case 3:  monthName = "March";
//                break;
//            case 4:  monthName = "April";
//                break;
//            case 5:  monthName = "May";
//                break;
//            case 6:  monthName = "June";
//                break;
//            case 7:  monthName = "July";
//                break;
//            case 8:  monthName = "August";
//                break;
//            case 9:  monthName = "September";
//                break;
//            case 10: monthName = "October";
//                break;
//            case 11: monthName = "November";
//                break;
//            case 12: monthName = "December";
//                break;
//            default: monthName = "Unknown";
//                break;
//        }
//        System.out.println(monthName);
	// write your code here
    }
}
