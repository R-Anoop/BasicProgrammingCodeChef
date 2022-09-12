/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Volcontrol
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner anoop = new Scanner(System.in);
		int t = anoop.nextInt();
		int count1=0;
		int count2=0;
		while(t!=0){
		    int x = anoop.nextInt();
		    int y = anoop.nextInt();
		    if(x>y){
		        System.out.println(x-y);
		    }
		    else if(y>x){
		        System.out.println(y-x);
		    }
		    else{
		        System.out.println(0);
		    }
t--;
}
	}
}
