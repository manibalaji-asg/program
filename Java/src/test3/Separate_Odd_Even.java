package test3;

import java.util.Scanner;

public class Separate_Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
