package com.epam.Lamdas_streams;

import java.util.*;
import java.util.stream.Collectors;

public class StringsStartingwithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n: ");
		int n = sc.nextInt();
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < n; i++) {
			String ele = sc.next();
			list.add(ele);
		}
		System.out.println("The strings starting with letter 'a' and length of 3 are : ");
		List<String> resultList = startingWithA(list);
		System.out.println(resultList);
	}

	private static List<String> startingWithA(List<String> list) {
		// TODO Auto-generated method stub
		List<String> res = list.stream().filter(str -> str.startsWith("a") && str.length() == 3).collect(Collectors.toList());
		return res;
	}

}
