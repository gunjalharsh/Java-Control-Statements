import java.util.Scanner;
class shop
{
 public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the cost of product 1: ");
int cost1 =s.nextInt();


System.out.println("Enter the cost of product 2 : ");
int cost2 =s.nextInt();


System.out.println("Enter the cost of product 3 : ");
int cost3 =s.nextInt();

System.out.println("cost of product 1 " + cost1);
System.out.println("cost of product 2 " + cost2);
System.out.println("cost of product 3" + cost3);

int cost=0;
int tcost= cost1+cost2+cost3;
int tdis= (int)(tcost*0.2);
int tdisprice= tcost-tdis;

if((cost1 >=0)&&(cost2 >=0)&&(cost3 >=0))
 
if((cost1 >cost2)&&(cost1 >cost3))
{
cost=cost1+cost2;
}
else if((cost1 > cost3) && (cost1 > cost2))
{
cost= cost1+cost3;
}
else if((cost1 < cost2) && (cost1 < cost3))
{
cost= cost2+cost3;
}
else
{
System.out.println("Cost cant be equal");
}

else{
System.out.println("Cost cant be negative");
}

if(cost >= tdisprice){
System.out.println("Offer 1 " + tdisprice);}
else
{
System.out.println("Offer 2 " + cost);
}
}
};








