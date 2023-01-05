package queueandhashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("ravi");
		set.add("vijay");
		set.add("ravi");
		set.add("ajay");
		System.out.println("after invoking remove(object) method "+set);
		System.out.println("size "+set.size());
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("removing ravi from set :"+set.remove("ravi"));
		HashSet<String> set1 = new HashSet<String>();
        set1.add("ajay");
        set1.add("gaurav");
        System.out.println("set1 "+set1);
        set.addAll(set1);
        System.out.println("updated set "+set);
        set.removeAll(set1);
        System.out.println("after invoking remove(object) method "+set);
        set.removeIf(str -> str.contains("vijay"));
        System.out.println("after invoking remove If method "+set);
        set.clear();
        System.out.println("after clear method "+set);
        
        
	}

}
