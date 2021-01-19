/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll_5;

/**
 *
 * @author Drew
 */
public class Payroll {
    private String firstName;
    private String lastName;
    private int ID;
    private double hourlyWage;
    private double hoursWorked;

    public Payroll(String firstName, String lastName, int ID, double hourlyWage, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    

    public double getGrossPay(double hourlyWage, double hoursWorked){
        return hourlyWage * hoursWorked;
    }

    
    
    
}
