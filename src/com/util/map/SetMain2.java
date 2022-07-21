package com.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String []args) {
		// 1-45 중복되지 않는 숫자 6개를 Set에 담아 출력
		Random random = new Random();
		HashSet<Integer> hashSet = new HashSet<>();
		
		boolean check = true;
		
		while(check) {			// num.size() != 6
			int num = random.nextInt(45)+1;
			hashSet.add(num);
			
			if(hashSet.size()==6) {
				check =! check;
				break;
			}
			
		}
		
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(hashSet);
		
	}
}
