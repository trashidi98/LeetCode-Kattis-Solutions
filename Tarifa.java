Link: https://open.kattis.com/problems/tarifa

import java.io.InputStreamReader;
import java.util.Scanner;

public class Noob {

    public static void main(String[] args) {
        
        int dataForNextMonth; 
        
        Scanner scanr = new Scanner(System.in);
        
        int dataPerMonth = scanr.nextInt();
        
        int months = scanr.nextInt();
        
        int totalData = dataPerMonth * months; 
        
        int[] p = new int[months]; 
        
        int dataUsed = 0;
        
        for(int i = 0 ; i < p.length ; i++) {
            p[i] = scanr.nextInt();
            
            dataUsed += p[i]; 
        }
        
        dataForNextMonth = (totalData - dataUsed) + dataPerMonth; 
        
        System.out.println(dataForNextMonth);
     }
}
