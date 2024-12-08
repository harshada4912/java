import java.util.Scanner;
public class logincheck
{
public static void main(String args[])
{
    Scanner scanner= new Scanner(System.in);

    String predefinedUsername="user123";
    String predefinedPassword="pass123";

    System.out.println("Enter first username");
    String Username1=scanner.nextLine();
    System.out.println("Enter first password");
    String password1=scanner.nextLine();



/*System.out.print("Enter second username");
String Username2=scanner.nextLine();
System.out.print("Enter second password");
String password2=scanner.nextLine();*/



    if(Username1.equals(predefinedUsername)&&password1.equals(predefinedPassword))
    {
        System.out.println("Login successful!");
    }
    else{
         System.out.println("error!Username or password do not match.");
    }
}
}




