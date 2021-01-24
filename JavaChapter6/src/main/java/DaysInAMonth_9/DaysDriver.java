/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaysInAMonth_9;

import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class DaysDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number 1-12 for the month");
        int month  = keyboard.nextInt();
        System.out.println("Enter a number for the year");
        int year = keyboard.nextInt();
        
        DaysInAMonth thisDay = new DaysInAMonth(month, year);
        System.out.println(thisDay.numberOfDays(month));
        if (thisDay.isLeap(year) == true) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
    
}
