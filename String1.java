import java.util.Scanner;
class String1
{
public static void main(String args[])
{
 
 Scanner scanner =new Scanner(System.in);
 System.out.println("Enter the string:");
 String name=scanner.nextLine();
   
  for(int i=0;i<name.length();i++)
{
   System.out.print(name.charAt(i)+ " ");
 }
}
}