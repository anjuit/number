import java.util.*;
class Arraycon
{
public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the size");
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++)
  a[i]=sc.nextInt();
Arrays.sort(a);
int j=1;
String s=new String();
String out=new String();
for(int i=a.length-1;i>=0;i--)
 s=s+""+a[i];
 if(s.length()%2==0)
 {
  for(int i=0;i<s.length();i++)
  {
   if(j<=3){
    out+=s.charAt(i);j++;}
    else
    {
     out+=","; j=0;}
     }
  }
  else
  {
   out=s.charAt(0)+",";
     for(int i=1;i<s.length();i++)
    {
     if(j<=3){
    out+=s.cahrAt(i);j++;}
    else
    {
     out+=","; j=0;}
     }
   }
   System.out.println(out);
   }
   }
