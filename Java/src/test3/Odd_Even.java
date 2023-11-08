/*You are provided with a number check whether its odd or even. 

Print "Odd" or "Even" for the corresponding cases.

Note: In case of a decimal, Round off to nearest integer and then find the output. 
Incase the input is zero, print "Zero".

Input Description:
A number is provided as the input.

Output Description:
Find out whether the number is odd or even. Print "Odd" or "Even" for the corresponding cases. 
Note: In case of a decimal, Round off to nearest integer and then find the output. 
In case the input is zero, print "Zero".

Sample Input :
2
Sample Output :
Even */

package test3;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sample Input:");
		Scanner s=new Scanner(System.in);
		float n = s.nextFloat();
		if(n==0){
			System.out.println("Zero");
		}
		else if (n%2==0) {
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}

	}

}
