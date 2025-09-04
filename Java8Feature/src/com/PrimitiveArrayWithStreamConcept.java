package com;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveArrayWithStreamConcept {

	public static void main(String[] args) {
	int num[]= {1,2,3,4,5,6,7,8,9,10};
	
//	// convert num to stream 
//	IntStream ii = Arrays.stream(num);
//	// intermediate operator 
//	IntStream evenNumber = ii.filter(n->n%2==0);
//	// terminal operator 
//	evenNumber.forEach(n->System.out.print(" "+n));
//	//evenNumber.forEach(n->System.out.print(" "+n));
	
	Arrays.stream(num).filter(n->n%2==0).forEach(n->System.out.print(" "+n));
	Arrays.stream(num).mapToLong(n->n+10).forEach(v->System.out.println(" "+v));
	Arrays.stream(num).mapToLong(n->n+10).filter(n->n%2!=0).forEach(v->System.out.println(" "+v));
	
	}

}