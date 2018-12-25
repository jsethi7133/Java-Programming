//finding string re-occurrence in a list of strings
import java.util.Scanner;
public class reocc{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter number of strings");
int n=obj.nextInt();
String a[]=new String[n];
System.out.println("Enter "+n+" strings");
for(int i=0;i<n;i++)
a[i]=obj.next();
System.out.println("String(s) that re-occur:");
for(int j=0;j<n-1;j++)
{
  String b=new String(a[j]);
  for(int k=j+1;k<n;k++)
  {
    if(b.equals(a[k]))
    {
      System.out.println(b);
      break;
    }
  }
}
}
}; 
