package test3;

import java.util.Scanner;

public class Convert_N_to_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  long b=0,d=0,temp=0;
	     	Scanner s=new Scanner(System.in);
			long n=s.nextLong();
			while(n>0)
			{
				d=n%10;
				System.out.print(d);
				temp=temp+d;
				n=n/10;
				//System.out.println(temp);
			}//System.out.print(temp);
	}

}
