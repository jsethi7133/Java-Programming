//array addition,subtraction and multiplication in java
import java.util.Scanner;
public class calc{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter size of array");
int n=obj.nextInt();
int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];
int d[]=new int[n];
int e[]=new int[n];
System.out.println("Enter array 1");
for(int i=0;i<n;i++)
 a[i]=obj.nextInt();
System.out.println("Enter array 2");
for(int i=0;i<n;i++)
 b[i]=obj.nextInt();
System.out.println("Addition");
for(int i=0;i<n;i++){
 c[i]=a[i]+b[i];
 System.out.println(c[i]);}
System.out.println("Subtraction");
for(int i=0;i<n;i++){
 c[i]=a[i]-b[i];
  System.out.println(c[i]);}
System.out.println("Multiplication");
for(int i=0;i<n;i++){
 c[i]=a[i]*b[i];
 System.out.println(c[i]);}
}
};