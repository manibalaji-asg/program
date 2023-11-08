/*Print the First 3 multiples of the given number "N". (N is a positive integer)

Note: print the characters with a single space between them.

Input Description:
A positive integer is provided to you as an input.

Output Description:
Print the First 3 multiples of the number with single spaces between them as an output.

Sample Input :
2
Sample Output :
2 4 6*/
package test3;

import java.util.Scanner;

public class First_3_Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner multiply=new Scanner(System.in);
		int number=multiply.nextInt();
		for(int i=1;i<=3;i++)
		{
			if(i==1)
			{
				int n=i*number;
				System.out.print(n);				
			}else 
			{
				System.out.print(" "+i*number);
			}
		}
	}

}
