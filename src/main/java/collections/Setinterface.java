package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Setinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();//LinkedHashSet same as HashSet//
hs.add(123);
hs.add(123);
hs.add("ABCD");
hs.add("ABCD");
hs.add(2345);
hs.add(2345);
System.out.println(hs);
	}

}
