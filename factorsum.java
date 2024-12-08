import java.util.Scanner;
public class factorsum
{
   public static void main(String args[])
 {
    Scanner scanner=new Scanner(System.in);
    System.out.println( "Enter the number:");
    int num = scanner.nextInt();
    int sum = 0;
    System.out.println("Factors of"+num+"are:");
  for(int i=1;i<=num;i++)
{
 if(num %i == 0)
 {
  System.out.print(i+ " ");
  sum+=i;
 }
 }
 System.out.println("\n sum of factors:"+sum);
 scanner.close();
}
}





































           