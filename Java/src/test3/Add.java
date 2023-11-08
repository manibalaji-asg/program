/*You are given Two Numbers, A and B. If C = A + B. Find C.

Note: Round off the output to a single decimal place.

Input Description:
You are provided with two numbers A and B.

Output Description:
Find the sum of the two numbers (A + B)

Sample Input :
1
1
Sample Output :
2 */
package test3;

import java.util.Scanner;

public class Add {
	
	public void method1() {
		int a=2, b=3, c;
		System.out.println(c=a+b);
	}
	
	public void method2() {
		Scanner s=new Scanner(System.in);
		int A = s.nextInt();
		Scanner x=new Scanner(System.in);
		int B = x.nextInt();
		int C=A+B;
		System.out.println(C);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add ad= new Add();
		ad.method1();
		ad.method2();
	}

}
