package com.ces.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();	
		
		for(int i=0; i<=100; i++) {
			values.add(i);
		}
		
		values.stream().filter(
				p->{
					System.out.println(p);
					return true;
				}).findFirst();
		
		Stream<Integer> s = values.stream();
		s.forEach(System.out::println);
		
		
		List<Integer> list = Arrays.asList(3,2,9,7,0);
		Consumer<Integer> c = new Consumer<Integer>()
				{
					public void accept(Integer i) 
					{
						System.out.println(i);
					}
				};
				list.forEach(c);
				
				
				List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
			/*	int result = 0;
				for(int i:list2) 
				{
					result = result+i*2;
				}
				
				System.out.println(result);*/
				System.out.println(list2.stream().map(i ->i*2).collect(Collectors.toList()));
		
		}
	

}
