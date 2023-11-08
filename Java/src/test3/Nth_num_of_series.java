/*You are provided with a number "N", Find the Nth term of the series: 1, 4, 9, 16, 25, 36, 49, 64, 81, .......

(Print "Error" if N = negative value and 0 if N = 0).

Input Description:
An integer N is provided to you as the input.

Output Description:
Find the Nth term in the provided series.

Sample Input :
18
Sample Output :
324 */
package test3;

import java.util.Scanner;

public class Nth_num_of_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a<0)
		{
			System.out.print("Error");
		}
		else if(a==0)
		{
			System.out.print("0");
		}
		else
		{
			int n=a*a;
			System.out.print(n);
		}
	}
}
