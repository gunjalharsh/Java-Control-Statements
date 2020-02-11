import java.util.Scanner;
class fibo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Months :");
		int n = sc.nextInt();
		int t1 = 0, t2 = 1;
		int nextterm,a=0;
		System.out.print("The amoeba size is ");
		for (int i = 1; i <= n; i++) {
        a=t1;
        nextterm = t1 + t2;
        t1 = t2;
        t2 = nextterm;
		}
	System.out.println(a);
}}