/*Let "A" be a year, write a program to check whether this year is a leap year or not.

Print "Y" if its a leap year and "N" if its a common year.

Input Description:
A Year is the input in the form of a positive integer.

Output Description:
Print "Y" if its a leap year and "N" if its a common year.

Sample Input :
2020
Sample Output :
Y*/
package test3;

import java.util.Scanner;

public class Lear_Year_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner year=new Scanner(System.in);
		int num=year.nextInt();
		if((num%4==0)||(num%100!=0)&&(num%400==0))
		{
			System.out.print("Y");
		}
		else
		{
			System.out.print("N");
		}
	}

}
