package util;

public class StringOps implements StringOperations {

    @Override
    public void reverse(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    @Override
    public void toUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }

            System.out.print(ch);
        }
    }

    @Override
    public int length(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  // keep accessing until exception
                count++;
            }
        } catch (Exception e) {
            // end of string
        }
        return count;
    }

    @Override
    public boolean isPalindrome(String str) {
        int n = length(str);

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String append(String s1, String s2) {
        int len1 = length(s1);
        int len2 = length(s2);

        char[] result = new char[len1 + len2];

        // copy s1
        for (int i = 0; i < len1; i++) {
            result[i] = s1.charAt(i);
        }

        // copy s2
        for (int i = 0; i < len2; i++) {
            result[len1 + i] = s2.charAt(i);
        }

        return new String(result);
    }
}
