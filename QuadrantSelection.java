//Link: https://open.kattis.com/problems/quadrant


//Mind you this will not work on Kattis but does run on local machine, didn't have time to debug 

import java.util.Scanner;;

public class Noob {

    public static void main(String[] args) {
        Scanner x1 = new Scanner(System.in); 
        
        Scanner y1 = new Scanner(System.in); 
        
        int x = Integer.parseInt(x1.nextLine());
        
        int y = Integer.parseInt(y1.nextLine());
        
        if((x < -1000 || x > 1000) || (y < -1000 || y > 1000)){
          System.exit(0); 
        }
        
        else if(x > 0 && y > 0) {
            System.out.println(1);
        }       
        
        else if(x < 0 && y >0) {
            System.out.println(2);
        }
        
        else if(x < 0 && y < 0) {
            System.out.println(3);
        }
        
        
        else {
            System.out.println(4);
        }
    }
    
}
