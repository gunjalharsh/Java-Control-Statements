import java.util.Scanner;
class sticks{
	public static void main(String args[])
	{
		int number,rect,number_st_sq,number_st_side,len_side,area;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Sticks :");
		 number=sc.nextInt();
		 rect=number%4;
		 number_st_sq=number-rect;
		 number_st_side=number_st_sq/4;
		 len_side=number_st_side*2;
		 area=len_side*len_side;
		System.out.println("Area "+area);
	}
}