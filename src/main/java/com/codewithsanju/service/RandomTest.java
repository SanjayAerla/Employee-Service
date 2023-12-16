package com.codewithsanju.service;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int i = 0;
		while(i<10) {
			System.out.println(random.nextInt(10));
			i++;
		}
	}
}
