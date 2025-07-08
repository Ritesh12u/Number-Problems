class BinaryToDecimal
{
	public static void main(String[] args)
	{
		findDecimal(1101);
	}
	public static void findDecimal(int num)
	{
		int sum = 0;
		int count =0;
		while(num > 0)
		{
			int rem = num%10;
			if(rem==1)
			{
				sum = sum + (int)Math.pow(2,count);
			}
			num = num/10;
			count++;
		}
		System.out.println(sum);
	}
}