import java.util.Scanner;
public class SquareRoot{
	public static void main(String[] args){
		
		Scanner in = new Scanner (System.in);
		double number = 9.0;
		System.out.print("guess the number: ");
		double guess = in.nextDouble();
		double x1 = 0;
		x1 = (guess + number / guess) / 2;
		while(x1 != Math.sqrt(number)){
			x1 = (x1 + number / x1) / 2;
			System.out.println(x1);
		}	
		
	}
	
}
