/*Using the method of looping, write a program to print the table of 9 till N in the format as follows:
(N is input by the user)

9 18 27...

Print NULL if 0 is input

Input Description:
A positive integer is provided as an input.

Output Description:
Print the table of nine with single space between the elements till the number that is input.

Sample Input :
3
Sample Output :
9 18 27 */
package test3;

import java.util.Scanner;

public class nineth_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=0;
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a==0) {
			System.out.println("NULL");
		}else
		{
		for(int i=1;i<=a;i++) 
		{
			System.out.print((i==1?"" :" ")+9*i);
		}
		}
	}

}
