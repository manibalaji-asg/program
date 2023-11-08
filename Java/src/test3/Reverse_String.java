/*
 * Write a program to get a string as input and reverse the string without using temporary variable.

Input Description:
A single line containing a string.

Output Description:
Print the reversed string.

Sample Input :
GUVI
Sample Output :
IVUG
 */
package test3;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String rev="";
        char ch;
        System.out.println("Entered string: "+str); 
        for (int i=0; i<str.length(); i++)
        {
        	ch= str.charAt(i); 
        	rev= ch+rev; 
        }
      System.out.println("Reversed word: "+ rev);
	}

}
