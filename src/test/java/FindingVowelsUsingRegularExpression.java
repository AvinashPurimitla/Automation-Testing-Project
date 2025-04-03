import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingVowelsUsingRegularExpression {
    public static void main(String[] args) {
        String input = "Hello, how many vowels are in this sentence?";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    public static int countVowels(String input) {
        // Define the regular expression pattern to match vowels (case insensitive)
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        
        // Create a matcher to find matches of the pattern in the string
        Matcher matcher = pattern.matcher(input);
        
        int count = 0;
        // Iterate over all matches and count them
        while (matcher.find()) {
            count++;
        }
        
        return count;
    
}

}
