package util;

import java.util.Comparator;

public class MyString implements Comparator<MyString> {
    
    private String str;

    public MyString() {
        super();
    }

    public MyString(String str) {
        super();
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    private int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "\nMyString [str=" + str + "]";
    }

    @Override
    public int compare(MyString o1, MyString o2) {
        int v1 = countVowels(o1.str);
        int v2 = countVowels(o2.str);

        if (v1 != v2) {
            return Integer.compare(v2, v1); 
        }

        return o1.str.compareToIgnoreCase(o2.str);
    }
}
