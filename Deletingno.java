import java.util.*;

public class Deletingno {
	public static void main(String sr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		int count=0;
		int m=n;
		while(m>0)
		{
			int r=m%10;
			count++;
			m=m/10;
		}
		int a[]=new int[count];
		int i=0;
		while(n>0)
		{
			int c=n%10;
			a[i]=c;
			n/=10;
			i++;
		}
		Arrays.sort(a);
		System.out.println(a[0]+""+a[1]);
	}

}
