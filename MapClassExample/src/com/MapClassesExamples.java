package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClassesExamples {

	public static void main(String[] args) {
	// HashMap 
	//Map mm  = new HashMap();			// unorder 
	// LinkedHashMap 
	//Map mm = new LinkedHashMap();		// maintain the order 
	// TreeMap 
	Map mm = new TreeMap();
	mm.put(2, "Ravi");
	mm.put(1, "Raju");
	mm.put(4, "Ramesh");
	mm.put(3, "Ram");
	//mm.put("a","b");
	System.out.println(mm);
	mm.put(2, "Mahesh");  // override the value 
	mm.put(6, "Raju");
	System.out.println(mm);
	System.out.println(mm.containsKey(1));
	System.out.println(mm.containsValue("Ravi"));
	System.out.println("value is "+mm.get(1));
	System.out.println("value is "+mm.get(100));
	}

}