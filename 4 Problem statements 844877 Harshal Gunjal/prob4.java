import java.util.Scanner;
class prob4{
	public static void main(String ar[])
	{
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of watermelon");
		size=sc.nextInt();
		if(size %2 == 0)
		{
			System.out.println("You get " +(size/2) + " and I get "+(size/2));
		}
		else{
			System.out.println("No share !! sorry..");
		}
		if(size%2==0){
		for(int i=1;i<=size/2;i++)
		{
			System.out.print(" "+(size-i));
			System.out.print(" "+i);
			System.out.print("\n");
		}
		}else
			System.out.println("no possibilities..");
	}
}