package com.ces.demo;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamFilters {

	public static void main(String[] args) {
		
		int[] numbers = {4,1,13,90,16,2,0,2,0};
		
		//clone  bcoz to avoid mutating the original array
		/*int [] copy = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(copy);
		for(int i=0; i<3; i++) {
			System.out.println(copy[i]);
		}*/
		
		// here we are not cloning and original array won't mutate
		// internally it will create the copy of array and it will work on it.
		/*IntStream.of(numbers).distinct().sorted().limit(3).
		forEach(System.out::println);*/
		
		//IntStream.range(1, 20).forEach(System.out::println);
		int[] number = IntStream.range(1, 20).toArray();
		System.out.println(number);
		IntStream.range(1, 20).boxed().collect(Collectors.toList());
	}

}
