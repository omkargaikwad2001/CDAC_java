package util;

import java.util.Comparator;

public class MyString implements Comparator<MyString>{

	String str;

	public MyString() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyString(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "\nMyString [str=" + str + " len = "+str.length()+"]";
	}

	@Override
	public int compare(MyString o1, MyString o2) {
	    
	    int lenCompare = Integer.compare(o1.str.length(), o2.str.length());
	    if (lenCompare != 0) {
	        return lenCompare;
	    }

	    return o1.str.compareToIgnoreCase(o2.str);
	}

	
}
