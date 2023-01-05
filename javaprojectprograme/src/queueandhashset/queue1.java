package queueandhashset;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue1 {

	public static void main(String[] args) {
		Queue que = new PriorityQueue();
        que.add(123);
        que.add(245);
        que.add(10);
        que.add(105);
        que.add(50);
        System.out.println("size :"+que.size());
        System.out.println("element of queue :"+que);
        System.out.println("head element of the using element :"+que.element());
        System.out.println("head element of the using element :"+que.peek());
        System.out.println("iterating que element using iterator");
        Iterator itr =  que.iterator();
        while(itr.hasNext()) {
        System.out.println(itr.next());
	}
	 System.out.println("print element of the using iterator :"+que);
	 System.out.println("removing element of the using removing :"+que.remove());  
	 System.out.println("head element of the using element :"+que);
	 System.out.println("head element of the using element :"+que.poll());  
	 System.out.println("head element of the using element :"+que);
   
        
	}

}
