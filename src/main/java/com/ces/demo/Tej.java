package com.ces.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tej {

	public static void main(String[] args) {
	
		List<Integer> list1 = new ArrayList<>();

		list1.add(1);

		List<Integer> list = Arrays.asList(10,2,3,4,5);
		Collections.sort(list);
		
		/*Comparator<Integer> c = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				if((Integer)o1 > (Integer)o2)
					return 1;
				
				return -1;
			}
			
		};
		
		list.sort(c);*/
		
		/*for(Integer i:list) {
			System.out.println(i);
		}*/
		
		list.forEach(i -> System.out.println(i));

	}

}
