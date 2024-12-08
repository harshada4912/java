import java.util.Scanner;
public class luckynumber
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);

System.out.print("Enter a four digit number: ");
int number=scanner.nextInt();

 int a=number/1000;
 int b=(number/100)%10;
 int c=(number/10)%10;
 int d=number%10;

if(a+b== c+d)
{
System.out.println(number+"is a lucky number.");
}
else
{
System.out.println(number+"is not a lucky number.");
}

scanner.close();
}
}

