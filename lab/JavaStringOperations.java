public class JavaStringOperations {
    public static void main(String[] args) {
        String str = "Welcome to Java World";

        // Returns the character at 5th position and display it.
        char fifthChar = str.charAt(4);
        System.out.println("Character at 5th position: " + fifthChar);

        // Compares the above String with Welcome lexicographically ignoring case differences and display the result.
        boolean isSame = str.substring(0,
7).equalsIgnoreCase("Welcome");
        System.out.println("Is \"Welcome\" same as first 7 characters of string: " + isSame);

        // Concatenates - Let us learn to the above string and display it.
        String concatStr = str.concat(" - Let us learn");
        System.out.println("Concatenated String: " + concatStr);

        // Returns the position of the first occurrence of character ‘a’ and display it.
        int aIndex = str.indexOf('a');
        System.out.println("Index of first 'a' character: " + aIndex);

        // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
        String replacedStr = str.replace('a', 'e');
        System.out.println("String after replacing 'a' with 'e': " + replacedStr);

        // Returns string between 4th position and 10th position and display it.
        String subStr = str.substring(3, 10);
        System.out.println("Substring between 4th and 10th position: " + subStr);

        // Returns the lowercase of the string and display it.
        String lowerCaseStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerCaseStr);
    }
}