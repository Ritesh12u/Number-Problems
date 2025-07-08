import java.util.Scanner;
class digitCount
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		System.out.println("Digit in number are :" +count(num));
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
}