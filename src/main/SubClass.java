/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Administrator
 */
public class SubClass extends InputClass{
    private double firstNumber;

    public SubClass() {
        System.out.print("Enter First number : ");
        firstNumber = super.getNumber();
    }
    
    public void EnterSameNumber(){
        int count = 5;
        while (count >= 0) {            
            System.out.print("Enter second number : ");
            double secondNumber = super.getNumber();
            if(firstNumber == secondNumber){
                return;
            }
            System.out.println("2 number not equal !!!");
        }
    }
    
}
