import java.util.*;
class sumdigit
{
 public static void main(String args[])
{
 int n,s=0,d;
 Scanner obj = new Scanner(System.in);
 System.out.println("enter the number");
 n= obj.nextInt();
 while(n!=0)
 {
  d = n%10;
  s=s+d;
  n=n/10;
 }
System.out.println("Sum of digits is"+s);
}
}
  