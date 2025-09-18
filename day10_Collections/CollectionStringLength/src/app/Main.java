package app;

import java.util.Set;
import java.util.TreeSet;

import util.MyString;

public class Main {

	public static void main(String[] args) {
		
		Set<MyString> s = new TreeSet<MyString>(new MyString());
		s.add(new MyString("Omkar"));
		s.add(new MyString("Bmkar"));
		s.add(new MyString("Amkar"));
		s.add(new MyString("Cdac"));
		s.add(new MyString("Knowit"));
		s.add(new MyString("Pune"));
		s.add(new MyString("Java"));
		s.add(new MyString("CPP"));
		
		System.out.println(s);
	}

}
