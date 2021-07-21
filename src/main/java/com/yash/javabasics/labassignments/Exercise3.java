import java.util.Scanner;

class Exercise3
{
	public void fibonacci(int n)
	{
		int a=-1,b=1,c,i;
		System.out.println("Fibonacci series: ");
		for(i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}

class Exercise3Main
{
	public static void main(String args[])
	{
		Exercise3 e3 = new Exercise3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int n = sc.nextInt();
		e3.fibonacci(n);
	}
}