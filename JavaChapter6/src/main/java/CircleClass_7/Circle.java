/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleClass_7;

/**
 *
 * @author Drew
 */

// Write a circle class that has: 
// radius: a double, PI: a final double with the value 3.14159
// The class should have the following methods
// Constructor. Accepts the radius of the circle as an argument
// Constructor. A no-arg constructor that sets the redius field to 0.0
// setRadius. A mutator method for the radius field
// getRadius. An accessor method for the radius field
// area Returns the area of the circle, which is calculated as area = PI * radius *radius
// diameter. Returns the diameter of the circle, calc as diameter = radius * 2
// circumference. Returns the circumference of the circle, which is calculated as circumference = 2 * PI * radius
// Write a program that demonstrates the Circle class by asking the user for the circle's radius , creating a circle object...
// And then reporting the circle's area, diameter, and circumference
public class Circle {
    private double radius;
    private final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = 0.0;
    } 

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(double PI, double radius) {
        return PI*Math.pow(radius,2);
    }
    
    public double getDiameter(double radius){
        return radius*2;
    }
    
    public double getCircumference(double PI, double radius){
        return 2*PI*radius;
    }
    
}
