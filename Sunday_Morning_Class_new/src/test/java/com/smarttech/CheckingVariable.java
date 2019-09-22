package com.smarttech;

import java.util.ArrayList;
import java.util.List;

public class CheckingVariable {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("sarower");
		list.add("sarower");
		list.add("Alam");
		list.add("Sobhan");
		list.add("Sobhan");
		list.add(null);
		list.add(null);
		
		System.out.println(list.size());
		System.out.println(list);
	}

}
