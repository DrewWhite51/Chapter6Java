/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeExample_1;

/**
 *
 * @author Drew
 */
public class EmployeeClassDriver_1 {
    public static void main(String[] args) {
        EmployeeClass_1 firstEmployee = new EmployeeClass_1("Susan", "Meyers", 47899, "Accounting", "VP");
        EmployeeClass_1 secondEmployee = new EmployeeClass_1("Mark", "Jones", 39119, "IT", "Programmer");
        EmployeeClass_1 thirdEmployee = new EmployeeClass_1("Joy", "Rogers", 81774, "Manufacturing", "Engineer");
        System.out.println("Name      /      ID Number      /      Deparment       /        Position      /");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(firstEmployee);
        System.out.println(secondEmployee);
        System.out.println(thirdEmployee);
    }
}