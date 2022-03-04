package com.ces.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class LamdaTest {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();		
		values.add(10);
		values.add(70);
		values.add(30);
		values.add(5);
		
		Collections.sort(values);
		values.forEach(p->System.out.println(p));
		
		List<Integer> list = Arrays.asList(3,2,9,7,0);
		list.forEach(p->System.out.println(p));

	}

}
