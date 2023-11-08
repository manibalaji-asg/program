/*You are given with a number A i.e. the temperature in Celcius. 
 * Write a program to convert this into Fahrenheit. 

Note: In case of decimal values, round-off to two decimal places.

Input Description:
A number is provided in Celcius as the input of the program.

Output Description:
The output shall be the temperature converted into Fahrenheit corresponding to the 
input value print up to two decimal places and round off if required.

Sample Input :
12
Sample Output :
53.60*/
package test3;

import java.util.Scanner;

public class Convert_Celcius_to_Fahrenhit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String out="test";
		Scanner temp=new Scanner(System.in);
		double n=temp.nextInt();
		double convert=(n*9/5)+32;
		System.out.print(convert);
		convert=Math.round(convert*100.0)/100.0;
		String test=String.format("%.2f",convert);
		System.out.print(test);
	}

}
