
package javaapplication1;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class JowaSimulator {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Boy or Girl? ");
        System.out.println("What's your Name? ");
        String name = input.nextLine();
        // clear
        System.out.println("Good Morning, mi Amore.");
        System.out.println("What do you want me to do?");
        System.out.println("[A] Eat \n[B] Sleep \n[C] Bonding");
        String choose = input.nextLine();
        if (choose.equals("A")){
        int jowaChoice = new Random().nextInt(2); // random
            if(jowaChoice==1){
                System.out.println("I think I want a home-cook food. Can you cook for me? ");
                System.out.println("Cooking and Eating");
                //loadingbar
                System.out.println("Burp... Thanks Love. I love you");
                // back to 7
            }
            else{
                System.out.println("I think I want a delivery");
                String jowaFood="";
                System.out.println("I choose "+jowaFood);
                            //loading
                System.out.println("Burp... Thanks Love. I love you");
                // back to 7
            }      
        }
        else if (choose.equals("B")){
            String placeToSleep= ""; //random
            System.out.println("Let's sleep on the "+placeToSleep);
            //loading 
            //end of the program
        }
        else if (choose.equals("C")){
            int randomChoice = new Random().nextInt(4);          
          
        }

    } 
}
class Choices {
    
    
    
    
    static void choiceB(int randomChoice){  
           
   }
    
    
    
    
    
    
    
   static void choiceC(int randomChoice){
   if (randomChoice==1){
            String games [] = {"Playstation","PC","Phone"};
            int numGames = new Random().nextInt(games.length);
            System.out.println("Let's play a game with "+games [numGames]);
            }
            else if (randomChoice==2){
                String Movies [] = {"Series","Movies"};
                int numMov = new Random().nextInt(Movies.length);
                System.out.println("Let's watch "+Movies[numMov]);
            }
            else{
                System.out.println("Cuddle and Getting to know each other");
            }
   }
}
