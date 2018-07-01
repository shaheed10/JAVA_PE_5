package com.stackroute.java;

import java.util.HashMap;

public class StringBooleanAssign {
	public static HashMap<String, Boolean> booleanAssign(String[] str){
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String,Boolean> bool = new HashMap<String, Boolean>();
		for(String s : str) {
			if(map.containsKey(s)) {
				 int count = map.get(s);
                 map.put(s, count + 1);
			}
			else {
				map.put(s,1);
			}
		}
		for(String k : map.keySet()) {
			Integer value = map.get(k);
			if(value >= 2) {
				bool.put(k, true);
			}
			else {
				bool.put(k , false);
			}
		}
		return bool;
	
		
	}
}
