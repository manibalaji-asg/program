package test3;

import java.util.Scanner;

public class Largest_num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array lenght:");
		int a =s.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter"+ a+"numbers:");
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<a;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}System.out.println(max);
	}

}
