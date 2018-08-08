package com.stringoperations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateWord {

	public static void main(String[] args) {
		occrenceOfWordInJava8("Java is java again Java");
	}

	public static void occrenceOfWord(String word){
		Map<String, Integer> wordCount = new HashMap<>();
		String [] arrayOfWord = word.split(" ");
		for(String str : arrayOfWord) {
			if(wordCount.containsKey(str.toLowerCase())) {
				wordCount.put(str.toLowerCase(), wordCount.get(str.toLowerCase()).intValue()+1);
			} else {
				wordCount.put(str.toLowerCase(), 1);
			}
		}

		Set<String> wordSet = wordCount.keySet();

		Iterator<String> itr = wordSet.iterator();

		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + "->" + wordCount.get(key));
		}
	}
	
	public static void occrenceOfWordInJava8(String word) {
		Map<String, Long> wordCount = new HashMap<>();
		List<String> listOfWord = Arrays.asList(word.split(" "));
		wordCount = listOfWord.stream().map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		wordCount.forEach((key , value) -> System.out.println(key+ "-> "+ value));
	}

}
