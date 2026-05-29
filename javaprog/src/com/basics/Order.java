package com.basics;

import java.util.*;

public class Order {
//
//	String prodName;
//	String color;
//	double price;
//	
//	Order(String prodName){
//		this(prodName, "black", 90000);
//		System.out.println("Order is placed");
//	}
//	
//	
//	Order (String prodName, String color, double price){
//		System.out.println("Prod Name: "+prodName);
//		System.out.println("Color Name: "+color);
//		System.out.println("Price Name: "+price);
//	}
//	

	public static void main(String s) {
////		Order O = new Order("Iphone 12 Mini");
//		ArrayList a = new ArrayList();
//		a.add(10);
//		a.add(10.1f);
//		a.add("Ganesh");
//		System.out.println(a.get(1));

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 10);
		map.put('X', 1);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char chars[] = s.toCharArray();
		int result = 0;
		int i, j;
		for (i = 0, j = 1; j < chars.length; i++, j++) {
			if (map.get(chars[i]) > map.get(chars[j])) {
				result += map.get(chars[i]);
			} else {
				result -= map.get(chars[i]);
			}
		}

	}

}
