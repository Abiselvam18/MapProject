package com.projects;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hob=new HashMap<Integer, String>();
		hob.put(1, "Anu");
		hob.put(4, "Keerthi");
		hob.put(2, "Abi");
		hob.put(3, "Varun");
		hob.put(3, "Varun");
		hob.put(5, "Varun");
		System.out.println(hob);
		
		System.out.println("");
		for(Map.Entry<Integer, String> m:hob.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}

	}

}
