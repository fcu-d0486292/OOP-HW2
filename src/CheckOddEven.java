import java.util.Scanner;
public class CheckOddEven {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int number;
		System.out.print("Enter a integer: ");
		number=input.nextInt();
		if(number%2==0)System.out.println("The input integer is Even Number.");
		else System.out.println("The input integer is Odd Number.");
		input.close();
	}
}