import java.util.Scanner;
class perfectNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		findperfect(num);
	}
	public static void findperfect(int num)
	{
		int temp  = num;
		int sum = 0;
		for(int i = 1; i <= num/2 ;i++)
		{
			if(num%i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == temp)
		{
			System.out.println("Perfect");
		}
		else
		{
			System.out.println("Not");
		}
	}
}