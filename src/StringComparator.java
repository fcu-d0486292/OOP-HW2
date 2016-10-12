import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String x,y;
		System.out.print("Enter a string 1: ");
		x=input.next();
		System.out.print("Enter a string 2: ");
		y=input.next();
		if(x.compareToIgnoreCase(y)==0)System.out.println("The two strings are the same.");
		else System.out.println("The two strings are not the same.");
		input.close();
	}

}