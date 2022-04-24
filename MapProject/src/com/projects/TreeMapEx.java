package com.projects;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Long, String> empData=new TreeMap<Long, String>();
		empData.put(9750397024l, "   Arun");
		empData.put(9856734250l, "   Varun");
		empData.put(8905674321l, "   Sam");
		empData.put(8754675677l, "   Bala");
		empData.put(8675343356l, "   Barath");
		empData.put(9753531479l, "   Vijay");
		empData.put(8123542238l, "   Karthi");
		empData.put(8643578968l, "   Vinay");
		empData.put(7734564888l, "   Manoj");
		empData.put(6784355778l, "   Preethi");
		System.out.println(empData);
		
		System.out.println("");
		for(Map.Entry<Long, String> m:empData.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}
}
