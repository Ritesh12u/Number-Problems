import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		findSum(num);
	}
	public static void findSum(int num)
	{
		int temp = num*num;
		int sum =0;
		while(temp>0)
		{
			int rem = temp%10;
			sum = sum+rem;
			temp = temp/10;
		}
		if(num == sum)
		{
			System.out.println("Neon Number");
		}
		else 
		{
			System.out.println("Not Neon");
		}
	}
}