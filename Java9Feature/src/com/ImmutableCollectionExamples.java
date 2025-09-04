package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Before Java 9
		List<String> typeOfUsers1 = new ArrayList<String>();
		typeOfUsers1.add("manager");
		typeOfUsers1.add("customer");
		typeOfUsers1.add("admin");
		System.out.println(typeOfUsers1);
		// After Java 9 : immutable collection 
		List<String> typeOfUsers2 = List.of("customer","admin");
		//typeOfUsers2.add("manager");
		System.out.println(typeOfUsers2);
		Set.of("A");
		Map.of(1,"A",2,"B");
	}

}