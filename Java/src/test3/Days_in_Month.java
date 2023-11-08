/*You will be provided with a number. Print the number of days in the month corresponding to that number.

Note: In case the input is February, print 28 days. If the Input is not in valid range print "Error".

Input Description:
The input is in the form of a number.

Output Description:
Find the days in the month corresponding to the input number. Print Error if the input is not in a valid range.

Sample Input :
8
Sample Output :
31*/
package test3;

import java.util.Scanner;

public class Days_in_Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		if(month==2)
		{
			System.out.print("28");
		}
		else if((month==0)||(month>31)) {
			System.out.print("Error");
		}
		else if(month%2==0)
		{
			System.out.print("31");
		}
		else
		{
			System.out.print("30");
		}
	}

}
