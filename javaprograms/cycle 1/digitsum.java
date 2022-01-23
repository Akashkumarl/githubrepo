class digitsum
{
  public static void main(String args[])
  {
    int a,sum=0,n;
    while(a!=0)
     {
       n=a%10;
       sum=sum+n;
       a=a/10;
     }
   system.out.println("Result="+sum);
 }
}