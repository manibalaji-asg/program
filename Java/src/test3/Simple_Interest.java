/*You are given with Principle amount($), Interest Rate(%) and Time (years) in that order. 
 * Find Simple Interest.

Print the output up to two decimal places (Round-off if necessary).

(S.I. = P*T*R/100)

Input Description:
Three values are given to you as the input. 
these values correspond to Principle amount, Interest Rate and Time in that particular order.

Output Description:
Find the Simple interest and print it up to two decimal places. Round off if required.

Sample Input :
1000 2 5
Sample Output :
100.00*/
package test3;

import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		float p=num.nextFloat();
		float t=num.nextFloat();
		float r=num.nextFloat();
		float n=(p*t*r)/100;
		String ans=String.format("%.2f",n);
		System.out.print(ans);
	}

}
