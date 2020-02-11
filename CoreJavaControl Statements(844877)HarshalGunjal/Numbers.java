import java.util.*;
class Numbers 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int sum1=0,sum2=0;
        int num[]=new int[4];
        System.out.println("Enter numbers: ");
        for(int i=0;i<num.length;i++){
            num[i]=input.nextInt();
            if(num[i]>0){
                sum2+=num[i];
            }
            
        }
        System.out.println("Sum of positive numbers: "+sum2);
        ;
    }
}