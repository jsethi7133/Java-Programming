//taking input in java
import java.util.Scanner;
public class ip{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter your rollno");
int roll=obj.nextInt();
System.out.println("Enter your name");
String name=obj.next();
System.out.println("Enter your salary");
double sal=obj.nextDouble();
System.out.println("Enter your height in cm");
float height=obj.nextFloat();
System.out.println("Hello "+name+", so you are rollno "+roll+", having "+sal+" salary and "+height+"cm height");
}
};
