import java.util.Scanner;
class armstrongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		findNum(num);
	}
	public static void findNum(int num)
	{
		int temp = num;
		int sum =0;
		int digit = count(num);
		while(num>0)
		{
			int rem = num%10;
			sum = sum+Pow(rem,digit);
			num = num/10;
		}
		if(temp==sum)
		{
			System.out.println("Armastrong");
		}
		else
		{
			System.out.println("Not");
		}
	}
	public static int count(int num)
	{
		int count =0;
		while(num!=0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	public static int Pow(int num,int pow)
	{
		int power = 1;
		for(int i = 1; i<=pow; i++)
		{
			power=power*num;
		}
		return power;
	}
}