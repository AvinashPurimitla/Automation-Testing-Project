package regularexpression;

import java.util.regex.Pattern;

public class RegularExpressionMethods {
	public static void main(String[] args) {
		
		String name="avinash";
		
		boolean result = Pattern.matches("^\\w*$", name);
		if(result) {
		System.out.println("matched");
	}else {
		System.out.println("not matched");}
	}

}
