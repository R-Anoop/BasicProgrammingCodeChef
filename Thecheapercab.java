/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Thecheapercab
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner anoop = new Scanner(System.in);
		int t = anoop.nextInt();
		while(t!=0){
		    int x = anoop.nextInt();
		    int y = anoop.nextInt();
		    if(x>y){
		        System.out.println("SECOND");
		    }
		    else if(x<y){
		        System.out.println("FIRST");
		    }else{
		        System.out.println("ANY");
		    }
		    t--;
		}
	}
}
