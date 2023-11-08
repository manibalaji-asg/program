package test3;

import java.util.Scanner;

public class Print_Digit_of_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String str=Integer.toString(n);
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
			if(i<str.length()-1)
			{
				System.out.print(" ");
			}
		}
	}

}
