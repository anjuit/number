import java.util.Arrays;
import java.util.Scanner;

public class Unique {
	public static void main(String sr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			if(i==a[i])
			{
			  System.out.println("index"+i+"&&"+a[i]);
			}
		}
	}

}
