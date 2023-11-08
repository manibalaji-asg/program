package test3;

import java.util.Scanner;

public class Printing_Even_Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number=new Scanner(System.in);
		int even=number.nextInt();
		for(int i=1;i<=even;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
