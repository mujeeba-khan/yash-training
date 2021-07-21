import java.util.Scanner;

class Excercise1
{
	public void cubesSum(int n)
	{
		int rem,cubes,sum=0,temp=n;
		while(n>0)
		{
			rem = n%10;
			cubes  = rem*rem*rem;
			sum = sum+cubes;
			n=n/10;
		}
		System.out.println("Sum of cubes of digits of "+ temp + " is "+ sum);
	}
}

class Main
{
	public static void main(String args[])
	{
		Excercise1 e1 = new Excercise1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int n = sc.nextInt();
		e1.cubesSum(n);
	}
}