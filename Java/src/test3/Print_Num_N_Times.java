/*Write a code to get 2 integers A and N. Print the integer A, N times in separate line.

Input Description:
First line contains an integer A. Second line contains an Integer N.

Output Description:
Print the integer A, N times in a separate line.

Sample Input :
2 3
Sample Output :
2
2
2*/
package test3;

import java.util.Scanner;

public class Print_Num_N_Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		for(int i=0;i<b;i++)
		{
			System.out.println(a);
		}
	}

}
