/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature_8;

/**
 *
 * @author Drew
 */
// Write a temperature class that will hold a temperature in F, and provides methods...
// To get the temp in F, C and K, the class should have the following field..
// fahrenheit - A double that holds a F temp
// The class should have the following methods
// Constructor - the constructor accepts a F temp as a double and stores it in the ftemp field
// setFahrenehit - Returns the value of the ftemp field, as a F temperature (no conversion required)
// celsius - Returns the value of the ftemp field omverted to Celsius
// kelvin - Returns the alue of the ftemp field converted to kelvin
// celsius conversion: C = (5/9) * (F-32)
// kelvin conversion: K = ((5/9)*(F-32))+273
// Demonstrate the class in a driver program
public class Temperature {
    private double fahrenheit;

    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    public double getCelsius(double fahrenheit) {
        double celsiusTemp = (5/9)*(fahrenheit-32);
        return celsiusTemp;
    }
    
    public double getKelvin(double fahrenheit){
        double kelvinTemp = ((5/9)*(fahrenheit-32))+273;
        return kelvinTemp;
    }
}
