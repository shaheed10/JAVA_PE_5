package com.stackroute.java;

import java.util.*;
import java.util.Map.Entry;;

public class NoOfStringCount {
	public static String countWords(String str){
		HashMap<String, Integer> hm  = new HashMap<String, Integer>();
		String str1[] = str.split("\\s");
		for(String word:str1) {
			if(hm.containsKey(word)) {
				hm.put(word,hm.get(word)+1);
			}else {
				hm.put(word, 1);
			}
			
		
		for(Entry<String, Integer> entry:hm.entrySet()) {
			return entry.getKey() + entry.getValue();
		}
		
		
	}
	
	
	
}
