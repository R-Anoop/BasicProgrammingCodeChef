/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CourseRegistration
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner anoop = new Scanner(System.in);
		int t = anoop.nextInt();
		while(t!=0){
		    int n = anoop.nextInt();
		    int m = anoop.nextInt();
		    int k = anoop.nextInt();
		    if(m>=n+k){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
