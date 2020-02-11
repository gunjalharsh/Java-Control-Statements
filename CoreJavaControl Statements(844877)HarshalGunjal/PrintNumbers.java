import java.util.Scanner;
class PrintNumbers{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		System.out.println("Your Result ..");
		for(int i=a;i<=b;i++)
			System.out.print(i+" ");
}}