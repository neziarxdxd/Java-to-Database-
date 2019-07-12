/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class practice {
    public static void main (String []args){
    int limit=10;
    int indec=0;
    for (int x=1; x<limit*2; x++){
        if (x<=limit){indec++;}
        if(x>limit){indec--;}
        
        for(int z=1; z<=indec; z++){
            if(x%2==0 && z%2==1){
                System.out.print("x:"+x+" z:"+z+"_s");
            }
            else{
                System.out.print("x:"+x+" z:"+z+"_*");
            }
              if(x%2==1 && z%2==0){
                System.out.print("x:"+x+" z:"+z+"_*");
            }
            else{
                System.out.print("x:"+x+" z:"+z+"_s");
            }
        
        
        }
        System.out.println("");
    }
    }
    
}
