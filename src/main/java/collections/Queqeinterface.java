package collections;

import java.util.PriorityQueue;

public class Queqeinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue pq=new PriorityQueue();
pq.add(1234);
pq.add(456);
pq.add(789);
System.out.println(pq);
System.out.println(pq.peek());//tells you what is the first element//
pq.poll();//addresses the first element andremoves after the query is solved//
System.out.println(pq);
	}

}
