package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionWithStreamAPI {

	public static void main(String[] args) {
//	List<String> names = new ArrayList<String>();
//	names.add("Ravi");names.add("Ajay");names.add("Meeta");names.add("Ramesh");
//	names.add("Mahesh");names.add("Vijay");names.add("Reeta");names.add("Lokesh");

	List<String> names = 
			Arrays.asList("Ravi","Ajay","Meeta","Ramesh","Mahesh","Vijay","Reeta","Lokesh");	
	
	// display all names contains "ee" character 
	//names.stream().filter(name->name.contains("ee")).forEach(name->System.out.print(" "+name));
	// display all names in upper case 
	//names.stream().map(name->name.toUpperCase()).forEach(name->System.out.print(name+" "));
	
	// display count the name start with "R" Character 
//	long numberOfNames = names.stream().filter(name->name.startsWith("R")).count();
//	System.out.println(numberOfNames);
	
	// check any name number of character must be > 6 character 
//	boolean result  = names.stream().anyMatch(name->name.length()>=6);
//	System.out.println(result);
	
	// collect help to store the result in another collection like set, list etc. 
List<String> EENames = names.stream().filter(name->name.contains("ee")).collect(Collectors.toList());
	System.out.println(EENames);
	}

}