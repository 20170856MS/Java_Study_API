package com.util.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(10);
		hashSet.add(1);
		hashSet.add(10);
		
		System.out.println(hashSet.size());
		Iterator<Integer> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}

}
