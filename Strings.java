//strings and string methods
public class Strings {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        // Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);

        // Length
        int length = str1.length();
        System.out.println("Length of str1: " + length);

        // Character at index
        char charAtIndex = str1.charAt(1);
        System.out.println("Character at index 1 of str1: " + charAtIndex);

        // Substring
        String substring = str1.substring(1, 4);
        System.out.println("Substring of str1 from index 1 to 4: " + substring);

        // Equals
        boolean isEqual = str1.equals(str3);
        System.out.println("str1 equals str3: " + isEqual);

        // CompareTo
        int comparison = str1.compareTo(str2);
        System.out.println("Comparison of str1 and str2: " + comparison);
    }
}
