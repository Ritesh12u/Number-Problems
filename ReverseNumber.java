import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println("Reverse Number is:" +Reverse(num));
	}
	public static int Reverse(int num)
	{
		int temp =0;
		while(num>0)
		{
			int rem = num%10;
			temp = temp*10 + rem;
			num = num/10;
		}
		return temp;
	}
}