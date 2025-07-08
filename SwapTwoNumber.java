import java.util.Scanner;
class SwapTwoNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1 :");
		int a = sc.nextInt();
		System.out.println("Enter the number2 :");
		int b = sc.nextInt();
		Swap(a,b);
	}
	public static void Swap(int a,int b)
	{
		System.out.println("Before swap:");
		System.out.println("a:"+a+" "+"b:"+b);

		/*//Using 3rd variable
		int temp;
		temp = a;
		a = b ;
		b = temp;*/

		//without 3rd variable
		//1st way
		/*a = a+b;
		b=a-b;
		a = a-b;*/

		//2nd way
		/*a = a*b;
		b=a/b;
		a=a/b;*/

		//3rd way
		/*a=a^b;
		b=a^b;
		a=a^b;*/

		//4th way
		a= b-a+(b=a);

		System.out.println("After Swap:");
		System.out.println("a:"+a+" "+"b:"+b);
	}
}