import java.util.Scanner;

public class Subset {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of 1st array");
	    int n=sc.nextInt();
	    System.out.println("enter size of 2st array");
	    int m=sc.nextInt();
	    int a1[]=new int[n];
	    int a2[]=new int[m];
	    String s1=new String();
	    String s2=new String();
	    System.out.println("enter the elements ");

	    for(int i=0;i<n;i++)
	    {
	    	a1[i]=sc.nextInt();
	    	s1+=a1[i];
	    }
	    System.out.println("enter the elements");

	    for(int i=0;i<m;i++)
	    {
	    	a2[i]=sc.nextInt();
	    	s2+=a2[i];
	    }
	  
	   if(s1.contains(s2))
	    {
	    	System.out.println("true");

	    }
	   else
		   System.out.println("flase");

	   

	    
	    
	}

}
