/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car_2;

import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class CarDriver {
     public static void main(String[] args) {
        
        
        
        int yearModel = 0;
        String make = " ";
        int speed;
        
        Scanner keyboard = new Scanner(System.in);
        
        Car car = new Car(yearModel, make);
        
        System.out.println("What is the year of your car?");
        yearModel = keyboard.nextInt();
        
        System.out.println("What is the make of your car?");
        keyboard.nextLine();
        make = keyboard.nextLine();
        
        System.out.println("What is the beginning speed of the car?");
        speed = keyboard.nextInt();
        
        car.setSpeed(speed);
        
        for (int i = 0; i < 5; i++){
            car.accelerate();
            System.out.println(car.getSpeed());
        
          
        }
        System.out.println("The " + yearModel + " " + make + " accelerated to " + car.getSpeed() + " mph.");
         for (int i = 0; i < 5; i++){
            car.brake();
            System.out.println(car.getSpeed());
        }
         
         System.out.println("The " + yearModel + " " + make + " slowed down to " + car.getSpeed() + " mph.");
        
    }
    
}
