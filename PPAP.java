import java.util.Scanner;
public class PPAP{
	public static void main(String[] args){
		
		Scanner in = new Scanner (System.in);
		System.out.print("input a sentence: ");
		String sentence1 = in.nextLine();
		int a = sentence1.indexOf("a ");
		int b = sentence1.indexOf(",");
		String c = sentence1.substring(a+2, b);
		String d = sentence1.substring(b+12, sentence1.length());
		String e = sentence1.substring(b+11, b+12);
		System.out.println("Uh! " + e.toUpperCase() + d + " " + c);
		
		
	}
	
}
