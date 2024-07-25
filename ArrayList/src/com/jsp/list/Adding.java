package com.jsp.list;

import java.util.ArrayList;
import java.util.List;

public class Adding {
	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>();
		 list.add(10);
		 list.add(20);
		 list.add(23);
		 list.add(9);
		 
		 for(Integer a:list) {
			 System.out.println(a);
		 }
		 
	}

}
