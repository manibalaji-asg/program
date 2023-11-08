/*Write a code to get an integer N and print values from 1 till N in a separate line.

Input Description:
A single line contains an integer N.

Output Description:
Print the values from 1 to N in a separate line.

Sample Input :
5
Sample Output :
1
2
3
4
5
*/
package test3;

import java.util.Scanner;

public class Print_Value_N_to_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			temp=n-i;
			System.out.println(i);
		}
	}

}
