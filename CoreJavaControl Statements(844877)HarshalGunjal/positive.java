import java.util.Scanner;
import java.util.Scanner;
public class positive	
{
       public static void main(String[] ars)
       {
          int num,sum=0;
          Scanner input = new Scanner(System.in);
          System.out.print("Enter Numbers :");
          while(true)
                 {
                         num=input.nextInt(); 
                         if(num<0)
                         break;
                         sum +=num;
                 }
                         System.out.println( "Sum is : " +sum);
        }
}