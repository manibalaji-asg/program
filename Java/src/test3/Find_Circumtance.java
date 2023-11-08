/*You are provided with the radius of a circle "A". Find the length of its circumference.

Note: In case the output is coming in decimal, roundoff to 2nd decimal place. 
In case the input is a negative number, print "Error".

Input Description:
The Radius of a circle is provided as the input of the program.

Output Description:
Calculate and print the Circumference of the circle corresponding to 
the input radius up to two decimal places.

Sample Input :
2
Sample Output :
12.57*/
package test3;

import java.util.Scanner;

public class Find_Circumtance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double r=s.nextDouble();
		if(r<0)
		{
			System.out.print("Error");
		}
		else
		{
			double c=2*Math.PI*r;
			double d=Math.round(c*100.0)/100.0;
			System.out.print(d);
		}
	}

}
