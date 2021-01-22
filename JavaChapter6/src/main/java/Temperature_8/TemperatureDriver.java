/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature_8;

import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class TemperatureDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a temp that you want to convert");
        double degreesF = keyboard.nextDouble();
        Temperature firstF = new Temperature(degreesF);
        System.out.println(degreesF + " degrees F in celsius is " +firstF.getCelsius(degreesF));
        System.out.println(degreesF + " degrees F in kelvin is " +firstF.getKelvin(degreesF));
        
    }
    
}
