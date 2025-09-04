package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListClassesExamples {

	public static void main(String[] args) {
		// 1st ArrayList Vs Normal Array 
		//ArrayList al = new ArrayList();
//		System.out.println("Size "+al.size());
//		al.add(10);
//		al.add("Ravi");
//		al.add(12000.50);		// it add at last 
//		System.out.println(al);
//		System.out.println("get the value using index "+al.get(1));
//		al.add(2,"Tester");
//		System.out.println(al);
//		al.remove(1);		// remove using index, by default index consider  
//		Integer id = 10;
//		al.remove(id);		// remove using object value. 
//		System.out.println(al);
//		System.out.println("Search "+al.contains("Tester"));
		// 2nd Example for LinkedList 
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(1,100);
		System.out.println(ll);
		ll.addFirst(100);
		ll.addLast(200);
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		
		Stack ss = new Stack();
		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(400);
		
		System.out.println(ss);
		System.out.println("Pop operation "+ss.pop());
		System.out.println(ss);
		System.out.println("Peek operation "+ss.peek());
		System.out.println(ss);
		System.out.println("Search operation "+ss.search(300));
		System.out.println("Search operation "+ss.search(100));
		System.out.println("Search operation "+ss.search(1000));
	}

}