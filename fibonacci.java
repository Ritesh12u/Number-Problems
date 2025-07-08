import java.util.Scanner;
class fibonacci
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		fibo(num);
	}
	public static void fibo(int num)
	{
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=3;i<=num;i++)
		{
			int n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}