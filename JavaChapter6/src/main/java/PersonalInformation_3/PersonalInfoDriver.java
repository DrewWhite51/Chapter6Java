/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonalInformation_3;

/**
 *
 * @author Drew
 */
public class PersonalInfoDriver {
    public static void main(String[] args) {
        PersonalInformation firstPerson = new PersonalInformation("Drew", "White", 21, "Working out", "Me");
        PersonalInformation secondPerson = new PersonalInformation("Dylan", "White", 20, "Football", "Brother");
        PersonalInformation thirdPerson = new PersonalInformation("Ray", "White", 16, "Shopping", "Sister");
        System.out.println("First name / Last name / Age / Hobby / Relation");
        System.out.println(firstPerson);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);
    }
}
