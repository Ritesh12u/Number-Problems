import java.util.Scanner;
class strongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		findSum(num);
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
	public static void findSum(int num)
	{
		int temp = num;
		int sum =0;
		while(num>0)
		{
			int rem = num%10;
			sum = sum+findfact(rem);
			num = num/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong");
		}
		else
		{
			System.out.println("Not");
		}
	}
}