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
public class RetailItemDriver {
    public static void main(String[] args) {
        RetailItem itemOne = new RetailItem("Jacket", 12, 59.95);
        RetailItem itemTwo = new RetailItem("Designer Jacket", 40, 34.95);
        RetailItem itemThree = new RetailItem("Shirt", 20, 24.95);
        System.out.println("Description / Units on Hand / Price");
        System.out.println(itemOne);
        System.out.println(itemTwo);
        System.out.println(itemThree);
    }
}
