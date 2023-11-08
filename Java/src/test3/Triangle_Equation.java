/*The area of an equilateral triangle is ¼(√3a2) where "a" represents a side of the triangle. 
You are provided with the side "a". Find the area of the equilateral triangle.

Input Description:
The side of an equilateral triangle is provided as the input.

Output Description:
Find the area of the equilateral triangle and print the answer up to 2 decimal places after rounding off.

Sample Input :
20
Sample Output :
173.21 */

package test3;

import java.util.Scanner;

public class Triangle_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		double d= s.nextDouble();
		double b;
		//double squareroot3 = 1.732f;
		b =(1.0/4.0) * Math.sqrt(3) * Math.pow(d, 2);
		String formattedArea = String.format("%.2f", b);
		System.out.print("b"+formattedArea);
	}

}
