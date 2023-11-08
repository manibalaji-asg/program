/*
 * You are given the coefficients of a quadratic equation in order A, B & C.

Where A is the coefficient of X2,  B is the coefficient of X and C is the constant term in the most simplified form.

Example: For  X2 + 5X + 6 = 0, you are given the input as: 1 5 6.

Write a program to find all of the roots of the quadratic.

Note: The output should be up to 2nd decimal place (round off if needed) and 
in case of a recurring decimal use braces i.e. for eg: 0.33333..... => 0.33.

Note: Use Shri Dharacharya's Method to solve i.e. X = {-b + √(b² - 4ac) } / 2a & {-b-√(b² -4ac)} / 2a

Input Description:
Three numbers corresponding to the coefficients of x(squared), 
x and constant are given as an input in that particular order

Output Description:
Print the two values of X after rounding off to 2 decimal places if required.

Sample Input :
1 5 6
Sample Output :
-2.00
-3.00
 */
package test3;

import java.util.Scanner;

public class Quadratic_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double root1=0,root2=0;
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double b=s.nextDouble();
		double c=s.nextDouble();
		double discriment=b*b-4*a*c;
		if(discriment>0)
		{
			root1=(-b+Math.sqrt(discriment))/(2*a);
			root2=(-b-Math.sqrt(discriment))/(2*a);
			System.out.printf("%.2f%n",+root1);
			System.out.printf("%.2f%n",+root2);
		}else if(discriment==0)
		{
			root1=root2=-b/(2*a);
			System.out.printf("%.2f%n",+root1);
			System.out.printf("%.2f%n",+root2);
		}
		else
		{
			double x=-b/(2*a);
			double y=Math.sqrt(-discriment)/(2*a);
			System.out.printf("%.2f%n", +x);
			System.out.printf("%.2f%n", +y);
		}
	}

}
