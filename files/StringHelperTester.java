

public class StringHelperTester {
	public static void main(String[] args) throws InterruptedException{
	System.out.println("Welcome to The String Helper Tester!");

	StringHelper.hasAllUniqueCharacters("unique");
	StringHelper.hasAllUniqueCharacters("abcdefg");
	System.out.println(StringHelper.meshStrings("apple", "banana"));
	System.out.println(StringHelper.replaceVowelsWithOodle("blueberry"));
	System.out.println(StringHelper.weight("heavy") + " kg");
	System.out.println(StringHelper.weight("light") + " kg");
}
}
