package app;

import java.util.Set;
import java.util.TreeSet;

import util.MyString;

public class Main {

    public static void main(String[] args) {
        
        Set<MyString> set = new TreeSet<>(new MyString());
        
        set.add(new MyString("Omkar"));
        set.add(new MyString("Education"));
        set.add(new MyString("Tree"));
        set.add(new MyString("Pune"));
        set.add(new MyString("caeiou"));
        set.add(new MyString("baeiou"));
        set.add(new MyString("Knowit"));
        set.add(new MyString("Java"));
        set.add(new MyString("Programming"));
        set.add(new MyString("CPP"));

        System.out.println(set);
        System.out.println("Size = " + set.size());
    }
}
