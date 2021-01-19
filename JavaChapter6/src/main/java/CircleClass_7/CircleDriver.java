/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleClass_7;

import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class CircleDriver {
    public static void main(String[] args) {
        double radius;
        final double PI = 3.14159;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = keyboard.nextDouble();
        
        Circle myCircle = new Circle(radius);
        System.out.println("The area of this circle is " + myCircle.getArea(PI, radius));
        System.out.println("The circumference of this circle is "+myCircle.getCircumference(PI, radius));
        System.out.println("The diameter of this circle is " +myCircle.getDiameter(radius));
    }
    
}
