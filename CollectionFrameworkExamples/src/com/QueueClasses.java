package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClasses {

	public static void main(String[] args) {
		// PriorityQueue 
		
		Queue q1 = new PriorityQueue();
		q1.add(3);q1.add(1);q1.add(6);q1.add(4);q1.add(8);q1.add(7);
		System.out.println(q1);
		System.out.println("Remove element "+q1.poll());
		System.out.println(q1);
		System.out.println("------------------");
		Queue q2 = new LinkedList();
		q2.add(3);q2.add(1);q2.add(6);q2.add(4);q2.add(8);q2.add(7);
		System.out.println(q2);
		System.out.println("Remove element "+q2.poll());
		System.out.println(q2);
	}

}