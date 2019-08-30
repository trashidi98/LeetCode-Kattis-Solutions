//Link: https://open.kattis.com/problems/autori

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Noob {

    public static void main(String[] args) throws IOException {
        String initials = ""; 
        
        Scanner scanr = new Scanner(System.in);
        
        String fullName = scanr.nextLine();
        
        String[] namesArr = fullName.split("-");
        
        for(String s: namesArr) {
            initials += s.substring(0, 1);
        }
        
        System.out.println(initials);
        
    
     }
}