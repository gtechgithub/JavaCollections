package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Person {

	String name;
	int id;
	
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

	
	Person (String name, int id){
		this.name = name;
		this.id = id;
	}
	
	Person (){
		name = "s";
		id = 0;
		
	}
	
	@Override
	public String toString () {
		
		return "id:" + id + " name:" + name;
	}
}

class PersonComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class ComparatorExample {
	
	public static void main(String args[]) {
		
		Person p1  = new Person ("Gopal", 1);
		Person p2 =  new Person ("Apple", 2);
		Person p3 = new Person ("choclate",3);
		Person p4 =  new Person ("avacado", 2);

		
		ArrayList<Person> collectionSet = new ArrayList();
		
		collectionSet.add(p1);
		collectionSet.add(p2);
		collectionSet.add(p3);
		collectionSet.add(p3);
		
		
		collectionSet.sort(new PersonComparator());
		
		for (Person person: collectionSet) {
			System.out.println(person);
		}
		
	}

	
}


