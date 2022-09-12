// We have populated the solutions for the 10 easiest problems for your support.
    // Click on the SUBMIT button to make a submission to this problem.
    
    import java.util.*;
    import java.io.*;
    import java.util.Scanner;
    
    class Atm{
        public static void main(String[] args) throws Exception{
            Scanner anoop = new Scanner(System.in);
            int n = anoop.nextInt();
            float f = anoop.nextFloat();
            if(n%5==0 && f>=n+0.5f)
            System.out.println(f-n-0.5f);
            else if(n%5!=0){
                System.out.println(f);
            }
            else{
                System.out.println(f);
            }
            
        }
    }
