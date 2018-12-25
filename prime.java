//checking prime number
import java.util.Scanner;
public class prime{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number");
int flag=0;
int n=obj.nextInt();
for(int i=2;i<n;i++)
{
if(n%i==0){
System.out.println("It is not prime");
flag=1;
break;}
}
if(flag==0||n==1||n==2){
System.out.println("It is prime");}
}
};