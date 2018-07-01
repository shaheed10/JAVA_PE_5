package com.stackroute.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.stackroute.java.UpdateArray;

public class UpdateArrayTest {

	@Test
	public void testArraysEmpty() {
		ArrayList<String> list = new ArrayList<>();
		list.add(0,"Apple");
		list.add(1,"Grape");
		list.add(2,"Melon");
		list.add(3,"Berry");
		ArrayList<String> list1 = new ArrayList<>();
		list1.add(0,"Kiwi");
		list1.add(1,"Grape");
		list1.add(2,"Melon");
		list1.add(3,"Berry" );
		
		assertEquals(list1,UpdateArray.arraysEmpty(list,"Apple","Kiwi"));
		
	}

}
