/*You are given a number A in Kilometers. Convert this into B: Meters and C: Centi-Metres.

Input Description:
A number "A" representing some distance in kilometer is provided to you as the input.

Output Description:
Convert and print this value in meters and centimeters.

Sample Input :
2
Sample Output :
2000
200000 */
package test3;

import java.util.Scanner;

public class Kilo_to_Meter_Centimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int a=(k*1000);
		int b=(k*100000);
		System.out.println(a);
		System.out.println(b);
	}

}
