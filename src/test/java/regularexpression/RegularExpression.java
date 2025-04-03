package regularexpression;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String word="avinash";
		boolean result = Pattern.matches(".*[aeiou].*", word);
		if(result) {
			System.out.println("word contains vowels");
		}else {
			System.out.println("word not contains vowels");
			
		}
		
	}

}
