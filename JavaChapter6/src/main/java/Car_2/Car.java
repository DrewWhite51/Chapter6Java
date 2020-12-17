/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car_2;

/**
 *
 * @author Drew
 */
public class Car {
    private int yearModel;
    private String make;
    private int speed;
    
    
    public Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public int getYearModel(){
        return yearModel;
    }
    
    public String getMake(){
        return make;
    }
    
    public void accelerate(){
        speed +=5;
    }
    
    public void brake() {
        speed -=5;
    }
    
    public int getSpeed(int speed){
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }
    
}
