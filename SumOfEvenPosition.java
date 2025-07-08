import java.util.Scanner;
class SumOfEvenPosition
{
	public static int Reverse(int num)
	{
		int temp =0;
		while(num>0)
		{
			int rem = num%10;
			temp = temp*10 + rem;
			num = num/10;
		}
		return result(temp);
	}
	public static int result(int num)
	{
		int pos = 0;
		int temp = 0;
		int res = 0;

		while(num>0)
		{
			temp = num%10;
			if(pos%2==0)
			{
				res = res + temp;
			}
			num = num/10;
			pos++;
			
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println("The even Num sum is:" +Reverse(num));
	}
}