/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestScores_6;

import java.util.Scanner;

/**
 *
 * @author Drew
 */
public class TestScoresDriver {
    public static void main(String[] args) {
        int firstScore;
        int secondScore;
        int thirdScore;
        
        Scanner keyboard = new Scanner(System.in);
        
        // Get first score
        System.out.println("Enter the first test score");
        firstScore = keyboard.nextInt();
        // Get second score
        System.out.println("Enter the second test score");
        secondScore = keyboard.nextInt();
        // Get third score
        System.out.println("Enter the third test score");
        thirdScore = keyboard.nextInt();
        
        TestScores averageScore = new TestScores(firstScore, secondScore, thirdScore);
        System.out.println("The average score of the three tests is "+averageScore.getAverageScore(firstScore, secondScore, thirdScore));
    }
}
