

import java.util.Scanner;
public class KeyboardScanner {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int x=0;
		float y=0;
		String z;
		System.out.printf("Enter a integer:");
		x=input.nextInt();
		System.out.printf("Enter a float point number:");
		y=input.nextFloat();
		System.out.printf("Enter a you name:");
		z=input.next();
		System.out.printf("Hi %s, the multiplication of %d and %f is %e. ",z,x,y,x*y);
		input.close();
	}
}