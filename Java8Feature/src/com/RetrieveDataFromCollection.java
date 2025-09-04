package com;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
	System.out.println(t);	
	}
}
public class RetrieveDataFromCollection {

	public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(10);list.add(20);list.add(30);list.add(40);list.add(50);
	System.out.println(list);
	System.out.println("Retrieve data from collection using iterator");
	Iterator<Integer> li = list.iterator();
	while(li.hasNext()) {
		int n =li.next();
		System.out.println(n);
	}
	System.out.println("Retrieve data from collection using forEach terminal operator/methdod for Stream API");
	Consumer<Integer> cc = new MyConsumer();
	list.forEach(cc);
	System.out.println("Reteive data from collection using forEach with lamda");
	list.forEach((n)->System.out.println(n));
	}

}