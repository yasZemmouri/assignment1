import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args){
        // 1. Prompt the user to enter a line of text containing the word 'java' somewhere within it
        System.out.println("1. Enter a line of text containing the world 'java' somewhere within it.");
        // 2. Read the line of text  (using the Scanner class nextLine method).
        String input;
        Scanner read = new Scanner(System.in);
        input = read.nextLine();
        // 3. Print the line of text entered.
        System.out.println("3. You entered the following text: " + input);
        // 4. Print the number of characters in the line
        System.out.println("4. The number of characters in your line is:  " + input.length());
        //5. Print the line in lowercase (use the String class toLowerCase() method)
        System.out.println("5. All lowercase is: " + input.toLowerCase());
        //6. Print the line in uppercase (use the String class toUpperCase() method)
        System.out.println("6. All uppercase is: " + input.toUpperCase());
        // 7. Locate the first occurrence of 'java' (use the String class indexOf() method), print the position value, and save it in a variable for the next step 
        //indexOf(String str)
        // Returns (int) the index within this string of the first occurrence of the specified substring.
        //Only double quote for string.
        int firstOccurrence = input.indexOf("java");
        if(firstOccurrence<0) {
            System.out.println("7. 'java' not found.");
            System.exit(1);
        }
        else {
            System.out.println("7. Found 'java' at pos: " + firstOccurrence);
            //8. Print the line with 'java' changed to 'Java'. 
            // Substring() parameters:
            // beginIndex - the beginning index, inclusive.
            // endIndex - the ending index, exclusive.
            // how space is handled?
            //redo i love java a lot beginning index 3.
            String beforeText = input.substring(0, firstOccurrence);
            String afterText = input.substring(firstOccurrence + 4);
            System.out.println("8. Changing to 'Java': " + beforeText + "Java" + afterText);
            //9. Print the line with 'java' changed to 'JAVA'
            System.out.println("9. Changing to 'JAVA': " + beforeText + "JAVA" + afterText);
        }

    }
}