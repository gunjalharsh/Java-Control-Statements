import java.util.*;
 class prob2
{

public static void main(String args[])
{

Scanner choco=new Scanner(System.in);
System.out.println("Enter the choco = ");
int chocono=choco.nextInt();

 
Scanner children=new Scanner(System.in);
System.out.println("Enter the children = ");
int childno=children.nextInt();
int i,j=0;
for(i=1;i <=childno;i++)
{

for( j=chocono;j>1;j=j-1)
{
chocono=chocono-1;
}

}

System.out.println("Chocolate left  " +j);}}
