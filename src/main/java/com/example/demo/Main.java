package com.example.demo;

import java.util.*;
class Main {
	public void solution(String len) {
		String[] words = len.split(" ");

		String longestWord = longWord(words);
		System.out.println("문자열에서 가장 긴 단어: " + longestWord);

		Map<String, Integer> map = new HashMap<>();
		for(String w : words){
			map.put(w, map.getOrDefault(w, 0) + 1);
		}

		List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());
		sortedList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

		System.out.println("문자열에서 가장 많이 나온 단어 Top 3:");
		int count = 0;
		for (Map.Entry<String, Integer> entry : sortedList) {
			if (count >= 3) break;
			System.out.println(entry.getKey() + ": " + entry.getValue() + "회");
			count++;
		}
	}


	private String longWord(String[] words) {
		String max = "";
		for (String word : words) {
			if (word.length() > max.length()) {
				max = word;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String len = kb.nextLine();

		T.solution(len);
	}
}


// package com.example.demo;
//
// import java.text.DecimalFormat;
// import java.util.*;
// class Main {
// 	public String solution(int kr) {
// 		double usa = 1332.00;
// 		double jp = 884.37;
//
// 		double usd = kr / usa;
// 		double jpy = kr / jp;
//
// 		DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
//
// 			return "달러($) = " + decimalFormat.format(usd) + " / JPY = " + decimalFormat.format(jpy);
// 	}
//
// 	public static void main(String[] args) {
// 		Main T = new Main();
// 		Scanner kb = new Scanner(System.in);
// 		int kr = kb.nextInt();
//
// 		System.out.print(T.solution(kr));
// 	}
// }


// package com.example.demo;
//
// 	import java.util.*;
// class Main {
// 	public Boolean solution(int n){
// 		if (n < 2) return false;
//
// 		int line = (int) Math.sqrt(n) + 1;
// 		for(int i = 2; i < line; i++){
// 			if(n % i == 0)return false;
// 		}
// 		return true;
// 	}
//
//
// 	public static void main(String[] args) {
// 		Main T = new Main();
// 		Scanner kb = new Scanner(System.in);
// 		int n = kb.nextInt();
//
// 		System.out.print(T.solution(n));
// 	}
// }


// package com.example.demo;
//
// public class Main {
// 	public static void main(String[] args) {
// 		Circle circle = new Circle(5);
// 		System.out.println("원의 면적: " + circle.getArea());
//
// 	}
// }

