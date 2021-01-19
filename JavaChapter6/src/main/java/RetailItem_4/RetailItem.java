/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailItem_4;

/**
 *
 * @author Drew
 */
public class RetailItem {
    private String desciprtion;
    private int unitsOnHand;
    private double price;

    public RetailItem(String desciprtion, int unitsOnHand, double price) {
        this.desciprtion = desciprtion;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    public String getDesciprtion() {
        return desciprtion;
    }

    public void setDesciprtion(String desciprtion) {
        this.desciprtion = desciprtion;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "RetailItem{" + "desciprtion=" + desciprtion + ", unitsOnHand=" + unitsOnHand + ", price=" + price + '}';
    }
    
}
