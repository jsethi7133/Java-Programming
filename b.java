//function overloading in java
import java.util.Scanner;
public class b{
public static void show(){
System.out.println("Hello!!");
}
public static void show(int i){
System.out.println("Hello i="+i);
}
public static void main(String args[]){
show();
System.out.println("Enter i");
Scanner obj=new Scanner(System.in);
int i=obj.nextInt();
show(i);
}
};