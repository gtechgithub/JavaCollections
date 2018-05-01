package com.javapoint;

import java.util.Enumeration;
import java.util.Hashtable;

/*******************

Enumeration is similar to the Iterator during earlier days, it was superceded by Iterator nowadays
basically it was used during vector, where as it is depreciated nowadays.





********************/

public class HashTableExample {

	public static void main(String arg[]) {
		
		Hashtable <String,Double> balance = new Hashtable <String,Double> ();
		
		balance.put("John Doe", 3434.34);
		balance.put("Tom Smith", 123.22);
		balance.put("Jane Baker", 1378.00);
		balance.put("Tod Hall", 99.22);
		balance.put("Ralph Smith", -19.08);
		
		Enumeration<String> keys = balance.keys();
		
		System.out.println("Printing all values \n------------------");
		
		while(  keys.hasMoreElements()) {
			String key = keys.nextElement();
			Double value = balance.get(key);
			
			System.out.println(key + " ===>" + value);
		}
		
		
		
		// Deposit 1,000 into John Doe's account.
		double bal = balance.get("John Doe");
		balance.put("John Doe", bal+ 1000);

		System.out.println("\n------------------");
		System.out.println("John Doe new balance:" + balance.get("John Doe"));
	}
}

/*************************************************************

Printing all values 
------------------
Tod Hall ===>99.22
Ralph Smith ===>-19.08
John Doe ===>3434.34
Jane Baker ===>1378.0
Tom Smith ===>123.22

------------------
John Doe new balance:4434.34

******************************************************************/
