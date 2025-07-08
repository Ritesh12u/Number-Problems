import java.util.Scanner;
class DigitSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println("Digit in number are :" +findSum(num));
	}
	public static int findSum(int num)
	{
		int sum =0;
		while(num>0)
		{
			int rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		return sum;
	}
}