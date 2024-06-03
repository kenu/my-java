package com.mycompany.autobox;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		for (int i = 1; i < 50; i += 2) {
			li.add(i);
		}
		System.out.println(li.get(20) instanceof Integer);

		others();
	}

	private static void others() {
		Character ch = 'a';
		Integer i = Integer.valueOf("3");
		System.out.printf("%c, %d", ch, i);
	}
}
