/*You are given three numbers A, B & C. Print the largest amongst these three numbers.

Input Description:
Three numbers are provided to you.

Output Description:
Find and print the largest among the three

Sample Input :
1
2
3
Sample Output :
3 */
package test3;

import java.util.Scanner;

//import java.util.Scanner;

public class Largest_num {
	
	public void method1() {
		int arr[]= {-3, 0, -11};
		int max=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}
	
	public void method2() {
		int temp;
		System.out.println("Enter three number: ");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b)
		{
			temp=a;
		}
		else
		{
			temp=b;
		}if(c>temp)
		{
			temp=c;
		}System.out.println(temp);
	}

	public static void main(String[] args) {
		Largest_num a=new Largest_num();
		System.out.println("Output of method1: ");
		a.method1();
		System.out.println("Output of method1: ");
		a.method2();
		
	}

}
