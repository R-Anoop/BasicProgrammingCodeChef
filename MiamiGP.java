/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MiamiGP
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner anoop = new Scanner(System.in);
		int t = anoop.nextInt();
		while(t!=0){
		    int x = anoop.nextInt();
		    int y = anoop.nextInt();
		    double z = x+(x*0.07);
		    if(z<y){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		    t--;
		}
	}
}
