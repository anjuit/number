

import java.util.Scanner;
 
class Revnum
{
   public static void main(String args[])
   {
      int n, reverse = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
    if(n>0)
    {
      while( n != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
 
      System.out.println("Reverse of entered number is "+reverse);
    }
    else
    System.out.println("number should be greater than 0");
   }
}
