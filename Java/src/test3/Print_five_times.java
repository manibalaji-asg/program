/*Write a code to get the input and print it 5 times.

Input Description:
A single line contains an integer N.

Output Description:
Output contains 5 lines with each line having the value N.

Sample Input :
4
Sample Output :
4
4
4
4
4*/
package test3;

import java.util.Scanner;

public class Print_five_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		int n=num.nextInt();
		for(int i=1;i<=5;i++)
		{
			System.out.println(n);
		}
	}

}
