


import java.util.Scanner;
class drona{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target.. ");
		int n = sc.nextInt();
		int count=0,sum=0,hit=0,i;
		System.out.println("Enter hit score.. ");
		for(i=0;sum<n;i++)
		{
			hit = sc.nextInt();
			sum=sum+hit;
		}
		System.out.println("The Number of turn is "+i);
		
}}