//Link: https://open.kattis.com/problems/fizzbuzz

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Noob {

    public static void main(String[] args) throws IOException {
        
        int i; 
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        
        String s = in.readLine(); 
        
        String[] t = s.split("\\s+"); 
        
        int[] t1 = new int[t.length];
        
        for(i =0; i < t.length ; i++) {
            t1[i] = Integer.parseInt(t[i]);
        }
        
        int x = t1[0];
        int y = t1[1];
        int n = t1[2];      
        
        if((x > 100 || y > 100 || n > 100) || (x < 1 || y < 1 || n < 1)) {
            return;
        }
        
        for(i = 1; i <= n ; i++ ) {
            
            if(((i % x)== 0) && ((i % y)== 0)) {
                System.out.println("FizzBuzz");
            }
            
            else if((i % x) == 0){
                System.out.println("Fizz");
            }
            
            else if((i % y) == 0) {
                System.out.println("Buzz");
            }
            
            else {
            System.out.println(i);
            }
        }
     }
}
