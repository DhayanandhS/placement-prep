public class Solution 
{
	public static String reverseString(String str) 
	{
		// Step 1: Trim the string to remove leading and trailing spaces
        str = str.trim();

        // Step 2: Split the string by spaces to get words
        // The regex "\\s+" ensures that multiple spaces are treated as a single space
        String[] words = str.split("\\s+");

        // Step 3: Reverse the list of words
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }

        // Step 4: Convert StringBuilder to String and return
        return reversedString.toString();
	}
}
