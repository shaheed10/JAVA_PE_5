package com.stackroute.test;
import java.util.*;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.java.ArraySort;

public class ArraySortTest {

	@Test
	public void testOrder() {
		Set<String> set1 = new HashSet<String>();
		
		set1.add("Harry");
		set1.add("Olive");
        set1.add("Alice");
        set1.add("Bluto");
        set1.add("Eugene");
        assertEquals(set1,ArraySort.order(set1));
	}

	@Test
	public void testSetConversion() {
		fail("Not yet implemented");
	}

}
