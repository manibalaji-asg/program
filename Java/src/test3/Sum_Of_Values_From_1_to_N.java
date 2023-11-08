/*Write a code to get an integer N and print the sum of  values from 1 to N.

Input Description:
A single line contains an integer N.

Output Description:
Print the sum of values from 1 to N.

Sample Input :
10
Sample Output :
55*/
package test3;

import java.util.Scanner;

public class Sum_Of_Values_From_1_to_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		sum=n*(n+1)/2;
		System.out.print(sum);
	}

}
