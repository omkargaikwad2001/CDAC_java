package app;

import util.StringOps;

public class Main {
    public static void main(String[] args) {
        StringOps ops = new StringOps();

        String str = "madam";

        System.out.print("Reverse: ");
        ops.reverse(str);

        System.out.print("\nUppercase: ");
        ops.toUpperCase("hello World");

        System.out.println("\nLength: " + ops.length("hello"));

        System.out.println("Is Palindrome (madam): " + ops.isPalindrome("madam"));
        System.out.println("Is Palindrome (java): " + ops.isPalindrome("java"));

        System.out.println("Append: " + ops.append("Hello", "World"));
    }
}
