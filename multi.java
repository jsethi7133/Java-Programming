//multithreading in java
public class multi extends Thread{
public void run(){
try{
for(int i=1;i<=10;i++){
System.out.println(i);
this.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("Interrupted:"+e);
}
}
public static void main(String args[]){
multi m1=new multi();
multi m2=new multi();
m1.setPriority(3);
m2.setPriority(10);
m1.start();
m2.start();
}
};