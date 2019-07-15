package ex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.tomcat.jni.Mmap;

public class MultiValueMapExample {

	@SuppressWarnings({ "rawtypes", "unchecked", "unchecked" })
	public static void main(String args[]) {

		MultiValuedMap<String,String> mMap = new ArrayListValuedHashMap();

		mMap.put("fruit", "apple");
		mMap.put("fruit", "mango");
	
		//printing keys using MultiSet
		MultiSet<String> keys = mMap.keys();
		System.out.println("printing keys using MultiSet:");
		keys.forEach(key -> System.out.println(key));
		
		//printing keys using set
		System.out.println("\n");
		Set<String> keySet = mMap.keySet();
		System.out.println("printing keys using Set:");
		keySet.forEach(key -> System.out.println(key));
		
		//print values
		System.out.println("\n");
		Collection<String> values = mMap.values();
		System.out.println("printing values:");
		values.forEach(value -> System.out.println(value));
		
		//check for contains key and values
		System.out.println("\n");
		System.out.println("contains key fruit:" + mMap.containsKey("fruit"));
		System.out.println("contains value mango:" + mMap.containsValue("mango"));
		
		System.out.println("\n");
		Collection valueList = mMap.get("fruit");
		System.out.println("printing values from get:");
		valueList.forEach(value -> System.out.println(value));
		
	}
	
}

/************ OUTPUT *********


printing keys using MultiSet:
fruit
fruit


printing keys using Set:
fruit


printing values:
apple
mango


contains key fruit:true
contains value mango:true


printing values from get:
apple
mango




*****************************/
