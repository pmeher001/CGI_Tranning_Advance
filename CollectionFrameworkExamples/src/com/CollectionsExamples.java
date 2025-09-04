package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

	public static void main(String[] args) {
		// List of item using Arrays class 
		
		List<Integer> num = Arrays.asList(2,4,5,1,8,9,6,10,7);
		System.out.println(num.size());
		System.out.println("Before Sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		Collections.sort(num);
		System.out.println();
		System.out.println("Aftre Sort - Asc");
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
		Collections.reverse(num);
		System.out.println("Aftre Sort - Desc");
		for(int n:num) {
			System.out.print(n+" ");
		}
	}

}