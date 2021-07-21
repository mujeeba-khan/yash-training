import java.util.Scanner;

class Exercise4
{
	public void prime(int n)
	{
		int i,j;
		System.out.println("Prime no.s. upto " + n + " are: ");
		for(j=2;j<=n;j++)
		{
			for(i=2;i<=j/2;i++)
			{
				if(j%i==0)
				{break;}
			}
			if(i>j/2 && j>1)
			{
				System.out.println(j);
			}	
		}
	}
}

class Exercise4Main
{
	public static void main(String args[])
	{
		Exercise4 e4 = new Exercise4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number..");
		int n = sc.nextInt();
		e4.prime(n);
	}
}