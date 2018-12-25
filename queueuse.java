//implementing queue in java
import java.util.Scanner;
class queue{
Scanner obj=new Scanner(System.in);
int arr[]=new int[10];
int front=-1,rear=-1;

void push(){
System.out.println("Enter element");
int ele=obj.nextInt();
if(rear>10)
 System.out.println("Overflow");
else if(front==-1 && rear==-1){
 front=0;
 rear=0;
 arr[rear]=ele;
}
else{
 rear=rear+1;
 arr[rear]=ele;
}
}

void pop(){
if(front==-1)
 System.out.println("Underflow");
else if(front==rear){
 rear=-1;
 front=-1;
}
else
 front=front+1;
}

void disp(){
if(front==-1)
 System.out.println("Underflow");
else{
 for(int i=front;i<=rear;i++)
  System.out.println(arr[i]);
}
}
};

public class queueuse{
public static void main(String args[]){
queue q=new queue();
Scanner scan=new Scanner(System.in);
int ch,c;
do{
System.out.println("Enter choice:");
System.out.println("1.Push");
System.out.println("2.Pop");
System.out.println("3.Display");
ch=scan.nextInt();
switch(ch){
case 1:q.push();
break;
case 2:q.pop();
break;
case 3:q.disp();
break;
default:System.out.println("Invalid choice");
break;
}
System.out.println("Press 1 to continue");
c=scan.nextInt();
}
while(c==1);
}
}; 