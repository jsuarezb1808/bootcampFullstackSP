/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaBasico;

import java.util.Scanner;
import java.util.List;

public class Challenge1 {
    Scanner sc=new Scanner(System.in);
    
    
    
    String firstpoint(){
        //initialize word var
        String word=null;
        
        //gets a value from user
        String Word_type=sc.nextLine();
        
        //evaluates value from user
        switch (Word_type) {
            case "Tipo A":
                //adds random numbers to var word using a method called random
                word="54";
                
                for (int i = 0; i < 8; i++) {
                    word=word+randomNumber(0, 9);
                }
                break;
            case "Tipo B":
                word="08";
                
                for (int i = 0; i < 8; i++) {
                    word=word+randomNumber(0, 9);
                }
                break;
            default:
                break;
        }
        
        
        System.out.println(word);
        return word;
    }
    
    boolean secondpoint(String word,List<String> existingwords){
    //List<String> existingwords = new ArrayList<String>();
    
    //boolean to check if the word exists, if it does =false
    boolean exists=true;
    //checks every position of the list to change exists status if required
        for (int i = 0; i < existingwords.size(); i++) {
            if (word==existingwords.get(i)) {
               exists=false;
            }
        }
    //returns the result 
    return exists;
    }
    
    int randomNumber(int minimum,int maximum){
        
        //minimum and maximum value
        int min = minimum;
        int max = maximum;
  
        int random = (int)Math.floor(Math.random()*(max-min+1)+min);
        
        return random;
    }
}
