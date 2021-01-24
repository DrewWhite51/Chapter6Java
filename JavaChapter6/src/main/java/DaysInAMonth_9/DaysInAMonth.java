/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaysInAMonth_9;

/**
 *
 * @author Drew
 */
// The class's constructor should accept two arguments
// -An integer for the month (1 = january, 2 = feb, etc)
// -An integer for the year
// the class should have a method named numberOfDays that returns the number of days..
// in the specified month
// The method should use the following criteria to identify leap years:
// Determine whether the year is divisible by 100. If it is, the it is a leap year...
// .. and if only divisible by 400., 2000 is a leap year, 2100 is not for example
// If the year is not divisible by 100, then it is a leap year if and only if it...
// .. is divisible by 4. for example, 2008 is a leap year but 2009 is not.
// Demonstrate the the class in a program that asks the user to enter  month and the year
// The program should then display the number of days in that month.
public class DaysInAMonth {
    public int month;
    public int year;

    public DaysInAMonth(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public boolean isLeap(final int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
    
    public String numberOfDays(int month){
        switch (month) {
            case 1:
                System.out.println("The number of days in January is 31");
                break;
            case 2:
                // 29 days if leap year
                if (isLeap(year) == true) {
                    System.out.println("The number of days in February is 29");
                } else {
                System.out.println("The number of days in February is 28");
                
                }
                break;
            case 3:
                System.out.println("The number of days in March is 31");
                break;
            case 4:
                System.out.println("The number of days in April is 30");
                break;
            case 5:
                System.out.println("The number of days in May is 31");
                break;
            case 6:
                System.out.println("The number of days in June is 30");
                break;
            case 7:
                System.out.println("The number of days in July is 31");
                break;
            case 8:
                System.out.println("The number of days in August is 31");
                break;
            case 9:
                System.out.println("The number of days in September is 30");
                break;
            case 10:
                System.out.println("The number of days in October is 31");
                break;
            case 11:
                System.out.println("The number of days in November is 30");
                break;
            case 12: 
                System.out.println("The number of days in December is 31");
                break;
            default:
                break;
        }
        return "";
        
    }
    
}

