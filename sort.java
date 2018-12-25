//sorting an array and finding minimum and maximum element
import java.util.Scanner;
public class sort{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter number of elements");
int n=obj.nextInt();
int a[]=new int[n];
System.out.println("Enter elements of array");
for(int i=0;i<n;i++){
 a[i]=obj.nextInt();}
for(int j=1;j<n;j++)
{
 int i=j-1;
 int key=a[j];
 while((i>=0) && (a[i]>key) ){
   a[i+1]=a[i];
   i=i-1;
   }
 a[i+1]=key;
}
System.out.println("Sorted array is:");
for(int k=0;k<n;k++)
 System.out.println(a[k]);
System.out.println("Maximun element is: "+a[n-1]);
System.out.println("Minimum element is: "+a[0]);
}
};