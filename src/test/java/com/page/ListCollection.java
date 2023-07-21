package com.page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListCollection {
	
	public static void main(String[] args) {
		List li = new ArrayList();
		
		li.add("hi");
		li.add("ppp");
		li.add("hirrr");
		
		Collections.addAll(li,"for");
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
	}
	
	
	


}
