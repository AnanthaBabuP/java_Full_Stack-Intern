package com.CollectionQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// Queue = data structure. FIFO(First in First Out ) Manner
		// peak(),element() = retrive First element  in List
		// poll() - remove the first element
		
		
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(75);
		q1.add(3);
		q1.add(7);
		q1.add(2);
		q1.add(8);
		
		q1.offer(36);
		System.out.println(q1);
		
		System.out.println(q1.peek());
		System.out.println(q1);
		
		System.out.println(q1.poll());
		System.out.println(q1);
		
		System.out.println(q1.element());
		System.out.println(q1);
		
		Queue<Integer> q2 = new PriorityQueue();
		q2.add(75);
		q2.add(3);
		q2.add(7);
		q2.add(2);
		q2.add(8);
		
		
		System.out.println(q2);
	}

}
