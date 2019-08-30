

//Link: https://open.kattis.com/problems/twostones

import java.util.Scanner;;

public class Noob {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        int s = Integer.parseInt(in.nextLine());
        
        if(s % 2 == 0) {
            System.out.println("Bob");
        }
        
        else {
            System.out.println("Alice");
        }
        
    }
    
}