public class series
{
    public static void main(String arg[])
    {
        int i,j,k,counter=0,f = 0;
        int a[]=new int[15];
 System.out.println("Series is : ");
 System.out.println("2");
 for (i=5;i<100;i++)
 {
  for (j=2;j<i;j++)
  {
   if (i%j==0)
   {
    f=0;
    break;
   }
   else
   {
    f=1;
   }
  }
  if (f==1)
  {
   counter++;
   if (counter%2!= 0)
   {
    System.out.println(i);   }
  }
 }
    }

}