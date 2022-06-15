package com.demo.app;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	
	
	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		list.add("sam");
		list.add("ram");
		
		
		
		List<String>list2=new ArrayList<String>();
		list2.add("rima");
		list2.add("sanu");
		
		list2.add(0,"yuvi");
		list.addAll(list2);
		System.out.println(list);
		list.stream().forEach(System.out::println);
	}
}
