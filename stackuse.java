//implementing stack in java
import java.util.Scanner;
class stack{
Scanner obj=new Scanner(System.in);
int top=-1;
int a[]=new int[10];

public void push(){
System.out.println("Enter element");
int ele=obj.nextInt();
if(top>=10)
 System.out.println("Overflow");
else{
 top=top+1;
 a[top]=ele;
}
}

public void pop(){
if(top==-1)
 System.out.println("Underflow");
else
 top=top-1;
}

public void disp(){
if(top==-1)
 System.out.println("Underflow");
else if(top==0)
 System.out.println(a[top]);
else
 for(int i=top;i>=0;i--)
   System.out.println(a[i]);
}
};

public class stackuse{
public static void main(String args[]){
stack s=new stack();
int c;
Scanner scan=new Scanner(System.in);
do{
System.out.println("Enter choice:");
System.out.println("1.Push");
System.out.println("2.Pop");
System.out.println("3.Display");
int ch=scan.nextInt();
switch(ch){
case 1:s.push();
break;
case 2:s.pop();
break;
case 3:s.disp();
break;
default:System.out.println("Invalid choice");
break;
}
System.out.println("Enter 1 to continue");
c=scan.nextInt();
}
while(c==1);
}
};