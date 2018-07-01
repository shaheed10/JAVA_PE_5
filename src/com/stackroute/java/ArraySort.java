package com.stackroute.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArraySort {

	public static Set<String> order(Set<String> str){
		Set<String> set = new TreeSet<String>(str);
		return set;
	}
	public static List<String> setConversion(Set<String> arr){
		Set<String> set = new TreeSet<String>(arr);
		List<String> list = new ArrayList<String>(set);
		return list;
	}

}
