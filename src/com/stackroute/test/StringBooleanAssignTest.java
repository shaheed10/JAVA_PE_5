package com.stackroute.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.stackroute.java.StringBooleanAssign;

public class StringBooleanAssignTest {


		@Test
		public void testAssign() {
		 String arr[] = {"a","b","c","d","a","c","c"};
		 HashMap<String,Boolean> str = new HashMap<String, Boolean>();
		 str.put("a", true);
		 str.put("b", false);
		 str.put("c", true);
		 str.put("d", false);
			assertEquals(str , StringBooleanAssign.booleanAssign(arr));
		
	}

}
