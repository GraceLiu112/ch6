import java.util.Scanner;
public class Doubloon{
	public static void main(String[] args){
		String word = "Ana";
		System.out.println(h(word));
	}
	public static String h(String w){

		for(int i = 0; i < w.length()-1; i++){
			if(w.charAt(i) == w.charAt(i+1)){
				return "is boolean";
			}
		
		}
		return "is not boolean";
		
	}
	
}
	
	

