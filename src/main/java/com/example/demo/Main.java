package com.example.demo;

import java.util.*;
class Main {
	public Boolean solution(int n){
		if (n < 2) return false;

		int line = (int) Math.sqrt(n) + 1;
		for(int i = 2; i < line; i++){
			if(n % i == 0)return false;
		}
		return true;
	}


	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		System.out.print(T.solution(n));
	}
}


// package com.example.demo;
//
// public class Main {
// 	public static void main(String[] args) {
// 		Circle circle = new Circle(5);
// 		System.out.println("원의 면적: " + circle.getArea());
//
// 	}
// }

