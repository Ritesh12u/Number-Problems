import java.util.Scanner;
class powerOfNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println("Enter the power");
		int pow = sc.nextInt();
		System.out.println("Power of the number are :" +Pow(num,pow));
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