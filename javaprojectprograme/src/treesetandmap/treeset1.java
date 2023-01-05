package treesetandmap;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset1 {

	public static void main(String[] args) {
		 TreeSet<String> al = new TreeSet<String>();
         al.add("ravi");
         al.add("vijay");
         al.add("ravi");
         al.add("ajay");
         System.out.println("treeset element are "+al);
         
         Iterator<String> itr = al.iterator();
         while(itr.hasNext()) {
         System.out.println(itr.next());

         }
         System.out.println("travarsing element through descending order");
           Iterator i = al.descendingIterator();
           while(i.hasNext()) {
        	   System.out.println(i.next());

         }
           
           TreeSet<Integer> set = new TreeSet<Integer>();
           set.add(24);
           set.add(66);
           set.add(12);
           set.add(15);
           System.out.println("treeset element are "+set);
           System.out.println("first element value "+set.pollFirst());
           System.out.println("after poll first tree set element are "+set);
           System.out.println("last element are "+set.pollLast());
           System.out.println("after poll first tree set element are "+set);
           
           TreeSet<String> set2 = new TreeSet<String>();
           set2.add("A");
           set2.add("B");
           set2.add("C");
           set2.add("D");
           set2.add("E");
           System.out.println("INITIAL SET "+set2);
           System.out.println("Tree set descending "+set2.descendingSet());
           System.out.println("head set "+set2.headSet("C"));
           System.out.println("head set "+set2.headSet("C",true));
           System.out.println("head set "+set2.subSet("A","E"));
           System.out.println("head set "+set2.subSet("A",false,"E",true));
           System.out.println("head set "+set2.tailSet("C"));
           System.out.println("head set "+set2.tailSet("C",false));
	}

}
 