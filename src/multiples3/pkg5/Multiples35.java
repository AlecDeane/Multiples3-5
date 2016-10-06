/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiples3.pkg5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alec
 */
public class Multiples35 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Take input for the purpose of getting highest num
        int i,limit,sum;
         sum = 0;
         limit = 1000;
        
        // Initiate while loop to catch all integers
        for(i = 0;i < limit ;i++){//result;i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.print("Sum of multiples of 3 and 5 up to " + limit + " = " + sum);
        
    }
    
}
