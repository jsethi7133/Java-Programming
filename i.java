//interface in java
interface i1{
void show1();
}
interface i2{
void show2();
}
public class i implements i1,i2{
public void show1()
{
 System.out.println("Interface 1");
}
public void show2()
{
 System.out.println("Interface 2");
}
public static void main(String args[])
{
 i obj=new i();
 obj.show1();
 obj.show2();
}
};
