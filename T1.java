class NaturalNum extends Thread{
public void run()
{
 for(int i=1;i<=10;i++)
   {
    System.out.println("Natural number:"+ i);
   if(i==3)
   {
     Thread.yield();
}
}
System.out.println("first thread end");
}
}
class Stop extends Thread{

public void run()
{
  for(int i=1;i<=10;i++)
{
  if(i==4)
  {
    System.out.println("2nd thread stop");
  }
System.out.println("no in 2nd thread" +  i);
}
System.out.println("second thread end");
}
}

class Sleep extends Thread{
public void run()
{
 try
{
  System.out.println(" 3rd thread sleep");
  Thread.sleep(2000);
  for(int i=1;i<=10;i++)
{ 
 System.out.println("no in 3rd thread" + i );
}
}
catch(InterruptedException e)
{
System.out.println(" 3rd thread is interrupted");

}
System.out.println("3rd thread end");
}
}
public class T1{
public static void main(String args[])
{
  NaturalNum n1=new NaturalNum();
  Stop n2=new Stop();
  Sleep n3= new Sleep();
   n1.start();
   n2.start();
   n3.start();
}
}
