class Mythread extends Thread{

public void run (){
for(int i=0;i<3;i++)
{
Thread.yield();
System.out.println("Thread started:"+Thread.currentThread().getName());
}

System.out.println("Thread ended:"+Thread.currentThread().getName());
}
}

public class YieldMethod
{
public static void main (String args[])
{
  Mythread thread= new Mythread();
  thread.start();
   for(int i=0;i<3;i++)
{
 System.out.println("Thread started:"+Thread.currentThread().getName());
}

System.out.println("Thread ended:"+Thread.currentThread().getName());
}
}

