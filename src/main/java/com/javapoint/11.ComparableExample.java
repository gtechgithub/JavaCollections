package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


class PersonComparable implements Comparable<PersonComparable> {

	String name;
	int id;
	
	
	
	public PersonComparable(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	
	public PersonComparable() {
		super();
		this.name = "";
		this.id = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Override
	public int compareTo(PersonComparable o) {
	
		return this.getName().compareTo(o.getName());
		
	}
	
	@Override
	public String toString () {
		
		return "id:" + id + " name:" + name;
	}
	
}

public class ComparableExample {
	
	public static void main (String args[]) {
	
	PersonComparable p1 =  new PersonComparable("Gopal", 1);
	PersonComparable p2 =  new PersonComparable ("Apple", 2);
	PersonComparable p3 = new PersonComparable ("choclate",3);
	PersonComparable p4 =  new PersonComparable ("avacado", 2);

	
	List<PersonComparable> collectionSet = new ArrayList();
	
	collectionSet.add(p1);
	collectionSet.add(p2);
	collectionSet.add(p3);
	collectionSet.add(p4);
	
	Collections.sort(collectionSet);

	
	for (PersonComparable person : collectionSet) {
		System.out.println(person);
	}

}
}
