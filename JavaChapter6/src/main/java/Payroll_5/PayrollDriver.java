/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll_5;

import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class PayrollDriver {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int ID;
        double hoursWorked;
        double hourlyRate;
        double grossPay;
        
        Scanner keyboard = new Scanner(System.in);
        
        // Get the employee's name
        System.out.println("Enter the employee's first name");
        firstName = keyboard.nextLine();
        // Get employee's last name
        System.out.println("Enter the employee's last name");
        lastName = keyboard.nextLine();
        //Get employee's ID
        System.out.println("Enter the employee's ID");
        ID = keyboard.nextInt();
        // Get the number of hours worked
        System.out.println("Enter the number of hours worked");
        hoursWorked = keyboard.nextDouble();
        // Get the hourly pay rate
        System.out.println("Enter the hourly pay rate");
        hourlyRate = keyboard.nextDouble();
        
        Payroll pay = new Payroll(firstName, lastName, ID, hoursWorked, hourlyRate);
        pay.setHourlyWage(hourlyRate);
        pay.setHoursWorked(hoursWorked);
        
        System.out.println("The employee " + firstName + " " + lastName + " will make $" + 
                pay.getGrossPay(hourlyRate, hoursWorked)+
                " this paycheck");
    }
}
