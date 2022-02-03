package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Listinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList al=new LinkedList();
al.add(123);
al.add(23456);
al.add("Hello");
al.add("Hi");
al.add("Hello");
al.get(2);
al.remove(1);
System.out.println(al.size());
System.out.println(al);
for(int i=0;i<al.size();i++) {
	System.out.println(al.get(i));
}
	}

}
