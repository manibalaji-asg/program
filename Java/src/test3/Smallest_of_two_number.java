/*You are provided with two numbers. Find and print the smaller number.

Input Description:
You are provided with two numbers as input.

Output Description:
Print the small number out of the two numbers.

Sample Input :
23 1
Sample Output :
1*/
package test3;

import java.util.Scanner;

public class Smallest_of_two_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a<b)
		{
			System.out.print(a);
		}else
		{
			System.out.print(b);
		}
	}

}
