class FirstDemoAppArgs
{
	public static void main(String args[])
	{
		int p = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		float result = p*n*r/100;
		System.out.println("The final amount received is "+result);
	}
}