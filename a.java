//constructor overloading in java
import java.util.Scanner;
public class a{
a(){
System.out.println("Parameter-less constructor");
}
a(int i){
System.out.println("Parameterized constructor with i="+i);
}
public static void main(String args[]){
a obj1=new a();
System.out.println("Enter i");
Scanner obj=new Scanner(System.in);
int i=obj.nextInt();
a obj2=new a(i);
}
};