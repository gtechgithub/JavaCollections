package com.javapoint;

import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorDemoExample {
	public static void main (String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		// Modify objects being iterated.
		ListIterator<String> iter = al.listIterator();
		System.out.println("printing values before change");
		while (iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
			iter.set(element + "+");
		}
		
		System.out.println("\n\nprinting values after change");
		
		// printing values
		while (iter.hasPrevious()) {
			System.out.println(iter.previous());
		}				
		
	}
}


/************************ output  **********************


printing values before change
C
A
E
B
D
F


printing values after change
F+
D+
B+
E+
A+
C+


********************************************************/
