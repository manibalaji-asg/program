package test3;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {1,2,3};
		String[] names = {"Mani", "Balaji", "Test"};
		for(int i=0; i<arr2.length; i++)
			/*First it will check the i value and it will print, then it increment using i++
			then it will check condition i<arr2.length*/
		{
			System.out.println(arr2[i]);
		}
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
		}
		//Enhanced for loop
		int[] arr = {1,2,3,4,5};
		String[] name = {"Mani", "Balaji", "Test"};
		for(int i:arr)
		{
			System.out.println(i);
		}
		for(String s:name)
		{
			System.out.println(s);
		}
	}

}
