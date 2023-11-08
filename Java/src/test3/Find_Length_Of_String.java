/*Let "A"  be a string. Remove all the whitespaces and find it's length.

Input Description:
A string is provide as an input

Output Description:
Remove all the whitespaces and then print the length of the remaining string.

Sample Input :
Lorem Ipsum
Sample Output :
10*/
package test3;

import java.util.Scanner;

public class Find_Length_Of_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b=a.replaceAll("\\s","");
		int length=b.length();
		System.out.print(length);
	}

}
