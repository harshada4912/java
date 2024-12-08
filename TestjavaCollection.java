import java.util.*;
class TestjavaCollection
{
public static void main(String args[])
{
ArrayList<String>list=new ArrayList<String>();
list.add("ravi");
list.add("ajay");
list.add("vijay");
list.add("ravi");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}