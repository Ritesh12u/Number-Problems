class decimalToBinary
{
	public static void main(String[] args)
	{
		findBinary(13);
	}
	public static void findBinary(int num)
	{
		String res = " ";
		while(num > 0)
		{
			int rem = num%2;
			res = rem + res;
			num = num/2;
		}
		System.out.println(res);
	}
}