import java.util.Scanner;
public class Scrabble{
	public static void main(String[] args){
		String word = "ana";
		String word1 = "hyfan";
		System.out.println(canspell(word, word1));
	}
	public static boolean canspell(String w, String f){
		int total =0;
		for(int i = 0; i < w.length(); i++){
			for(int j = 0; j < f.length(); j++)
				if(w.charAt(i) == f.charAt(j)){
					total++;
					j = f.length();
			}
		
		}
		if(total == w.length())
		{
			return true;
		}
		else{
			return false;
		}
		
	}
	
}
