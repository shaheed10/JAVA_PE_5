package com.stackroute.java;

import java.util.ArrayList;
import java.util.List;

public class UpdateArray {
	public static ArrayList<String> arraysEmpty(ArrayList<String> list,String oldEle,String newEle) {
		int i = list.indexOf(oldEle);
		list.set(i,newEle);
		return list;
		
	}
    public static List<?> remove(List<String> remove){
        remove.clear();
        return remove;
    }
	

}

