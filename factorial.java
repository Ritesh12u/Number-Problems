import java.util.Scanner;
class factorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println("Factorial of the number are :" +findfact(num));
	}
	public static int findfact(int num)
	{
		int fact = 1;
		for(int i = num; i>=1; i--)
		{
			fact = fact*i;
		}
		return fact;
	}
}