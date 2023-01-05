package treesetandmap;

import java.util.HashMap;
import java.util.Map;

public class mapexample {

	public static void main(String[] args) {
		Map m1 = new HashMap();
       m1.put("key1","admin");
       m1.put("key2","admin");
       m1.put("null","admin123");
       System.out.println("map element are "+m1);
       System.out.println("map element are "+m1.size());
       m1.put("key2","manager");
       m1.put(458, "manager");
       m1.put(null , 1234);
       System.out.println("map element are "+m1);
       System.out.println("map element are "+m1.size());
       System.out.println("map element are "+m1.get("Key1"));
       System.out.println("map element are "+m1.keySet());
       System.out.println("map element are "+m1.values());
       
       
       
       
       
	}
 
}
