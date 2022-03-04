package com.ces.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaptopImpl {

	public static void main(String[] args) {
		
		Laptop lp1 = new Laptop("DELL1",1000,2);
		Laptop lp2 = new Laptop("DELL2",6000,1);
		Laptop lp3 = new Laptop("DELL3",3000,4);
		
		List<Laptop> list = new ArrayList<>();
		
		
		list.add(lp1);
		list.add(lp2);
		list.add(lp3);
		
		Comparator<Laptop> com = new Comparator<Laptop>() 
				{

					@Override
					public int compare(Laptop o1, Laptop o2) {
						if(o1.getPrice() > o2.getPrice())
							return 1;
						return -1;
					}
			
				};
			
		
	
		
		
		Collections.sort(list,com);
		
		list.forEach(p ->  System.out.println(p));

	}

}
