package com.projects;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> L=new LinkedHashMap<Integer, String>();
		L.put(1, "Anu");
		L.put(4, "Keerthi");
		L.put(2, "Nithi");
		L.put(3, "Varun");
		L.put(3, "Varun");
		L.put(5, "Varun");
		System.out.println(L);
		
		System.out.println("");
		for(Map.Entry<Integer, String> m:L.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
	}
	}
}

