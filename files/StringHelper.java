import java.io.BufferedReader;
public class StringHelper {


	
	public static void hasAllUniqueCharacters(String inputs) {
		boolean test = true;
		inputs = inputs.toLowerCase();
		for (int i = 0; i < inputs.length()-1; i++) {
		for (int j = i+1; j < inputs.length(); j++) {
			if (inputs.charAt(i) == inputs.charAt(j)) {
				test = false;
			
		}
	}
		}
		System.out.println("Testing has all unique characters with '" + inputs + "'");
		System.out.println(test);

}
	
	public static String meshStrings(String one, String two) {
		StringBuffer buff = new StringBuffer();
        int max = Math.max(one.length(), two.length());
        for(int i = 0; i < max; i++) {
           	if(i < one.length()) {
                buff.append(one.charAt(i));
            }
            if(i < two.length()) {
                buff.append(two.charAt(i));
            }
        }
        System.out.println("Testing Mesh Strings with '" + one + "' " + "and '" + two + "'");
        return buff.toString();
	}
	 public static String replaceVowelsWithOodle(String oodle) {
	     oodle = oodle.toLowerCase();   
	     System.out.println("Testing Replace Vowels With Oodle with '" + oodle + "'");
		 return oodle.replaceAll("[aeiou]", "oodle");
	}
	public static double weight(String word) {
		double weight = 0.0;
		word = word.toLowerCase();
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
				weight = weight+2.5;
			}else {
				weight = weight+3.4;	
			}
		}
		 System.out.println("Testing Weight with '" + word + "'");
		return weight;
		
	}
}
