package test3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String reverse="";
	    int length=str.length();
	    for (int i=(length-1);i>=0;--i) {
	      reverse =reverse+str.charAt(i);
	    }
	    if (str.toLowerCase().equals(reverse.toLowerCase())) {
	      System.out.println(str + " is a Palindrome");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome");
	    }
	}

}
