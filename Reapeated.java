import java.util.Arrays;
import java.util.Scanner;

public class Repeated {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int a[]=new int[n];
		int s[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					s[k]=j;
					k++;
				}
			}
		}
		Arrays.sort(s);
		for(int i=0;i<n;i++)
		{
		 if(s[i]!=0)
		 {
		 System.out.println("output"+a[s[i]]);
		 System.exit(0);
		 }
	  }

}
