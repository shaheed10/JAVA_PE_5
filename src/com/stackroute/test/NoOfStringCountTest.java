package com.stackroute.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.stackroute.java.NoOfStringCount;

public class NoOfStringCountTest {

	@Test
	public void testCountWords() {

		assertEquals("one=5 two=2 three=2",NoOfStringCount.countWords("one one one two three one three one two"));

	}

}
