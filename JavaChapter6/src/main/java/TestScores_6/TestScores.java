/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestScores_6;

/**
 *
 * @author Drew
 */
public class TestScores {
    private int firstScore;
    private int secondScore;
    private int thirdScore;

    public TestScores(int firstScore, int secondScore, int thirdScore) {
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.thirdScore = thirdScore;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    public int getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

    public int getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(int thirdScore) {
        this.thirdScore = thirdScore;
    }

    @Override
    public String toString() {
        return "TestScores{" + "firstScore=" + firstScore + ", secondScore=" + secondScore + ", thirdScore=" + thirdScore + '}';
    }
    
    public int getAverageScore(int firstScore, int secondScore, int thirdScore){
        int averageScore = (firstScore+secondScore+thirdScore)/3;
        return averageScore;
        
    }
}
