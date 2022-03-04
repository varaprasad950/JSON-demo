package com.ces.demo;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

import sun.awt.image.InputStreamImageSource;

public class SteamTest {

	public static void main(String[] args) {
		//int num[] = {2,5,9,1,6,0,12};
		int num[] = {2,5,9,1,6,0,12};
		
		/*int min = num[0];
		for(int i=1;i<num.length;i++) {
			if(min > num[i]) {
				System.out.println("true:"+ num[i]);
				min=num[i];
			}
		}
		System.out.println(min);*/
		//int m = IntStream.of(num).min().getAsInt();
		//IntStream.of(num).min().ifPresent(m -> System.out.println(m));
		/*IntStream.of(num).min().ifPresent(System.out::println);
		IntStream.of(num).max().ifPresent(System.out::println);
		IntStream.of(num).average().ifPresent(System.out::println);
		long count = IntStream.of(num).count();
				System.out.println(count);
		long sum = IntStream.of(num).sum();
			    System.out.println(sum);*/
			    
	   IntSummaryStatistics statistics =  IntStream.of(num).summaryStatistics();
	   
	   System.out.println( statistics.getMin());
	   System.out.println(statistics.getMax());
	   statistics.getAverage();
	   statistics.getCount();
	   statistics.getSum();
	   
			    
			    
			    
		
	}

}
