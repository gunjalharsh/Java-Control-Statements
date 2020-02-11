import java.util.Scanner;
class prob1
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
int billno,date;
System.out.println("Date");
date=sc.nextInt();
if(date >0 && date<=31)
{
System.out.println("Billno");
billno=sc.nextInt();
int a=billno%date;
int b=(billno-date)%10;
if(a == 0 || b ==0)
System.out.println("luck");
else
System.out.println("not lucky");
}
else
System.out.println("Proper date");
}
}