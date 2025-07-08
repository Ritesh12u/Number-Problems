import java.util.Scanner;
class HappyNumber{
	public static void check(int num)
	{
		while(num!=4 && num!=1)
		{
			int sum = 0;
			while(num>0)
			{
				int rem = num%10;
				int sq = rem*rem;
				sum = sum + sq;
				num = num/10;
			}
			num =sum;
		}
		if(num==1)
		{
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		check(num);
	}
}