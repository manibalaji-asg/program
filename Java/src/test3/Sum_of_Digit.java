/*Write a code get an integer number as input and print the sum of the digits.

Input Description:
A single line containing an integer.

Output Description:
Print the sum of the digits of the integer.

Sample Input :
124
Sample Output :
7*/
package test3;

import java.util.Scanner;

public class Sum_of_Digit {

	public static void main(String[] args) {
        long b=0,d=0,temp=0;
     	Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		while(n>0)
		{
			d=n%10;
			temp=temp+d;
			n=n/10;
		}System.out.print(temp);
    }
}