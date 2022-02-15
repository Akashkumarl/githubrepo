import java.io.*;
import java.util.*;
class exp2
{
 public static void main(String args[])throws Exception
 {
  FileInputStream fin = new FileInputStream("e1.txt");
   int c=0,l=0,w=0;
   int ch;
   while((ch=fin.read())!=-1)
  {
    c++;
if(ch=='\n')
l++;
if(ch==' '||ch=='\n')
w++;
}
System.out.println("No of characters ="+c);
System.out.println("No of words="+w);
System.out.println("No of lines="+l);
fin.close();
}
}
