package com.stringoperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DuplicateWord {

	public static void main(String[] args) {
		//occrenceOfWordInJava8("Java is java again Java");
		//occurenceOfCharInJava7("Java is java again Java");
		//occurenceOfCharInJava8("Java is java again Java");
		duplicateCharsInStringJava8("aabbcdeeqqfffffh");
	}

	public static void occrenceOfWordInJava7(String word){
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
	
	public static void occurenceOfCharInJava7(String word) {
		Map<Character, Integer> charCount = new HashMap<>();
		for(Character ch : word.toCharArray()) {
			if(charCount.containsKey(ch.toUpperCase(ch))) {
				charCount.put(ch.toUpperCase(ch), charCount.get(ch.toUpperCase(ch)).intValue()+1);
			} else {
				charCount.put(ch.toUpperCase(ch), 1);
			}
		}
		
		Set<Character> charSet = charCount.keySet();
		
		Iterator<Character> itr = charSet.iterator();
		while(itr.hasNext()) {
			Character key = itr.next();
			System.out.println(key +"->"+charCount.get(key) );
		}
	}
	
	public static void occrenceOfWordInJava8(String word) {
		Map<String, Long> wordCount = new HashMap<>();
		List<String> listOfWord = Arrays.asList(word.split(" "));
		wordCount = listOfWord.stream().map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));		
		wordCount.forEach((key , value) -> System.out.println(key+ "-> "+ value));
	}
	
	public static void occurenceOfCharInJava8(String word) {
		char [] chars = word.toCharArray();
		List<Character> charList = new ArrayList<>();
		for(Character ch : chars) {
			charList.add(ch.toUpperCase(ch));
		}
		Map<Character, Long> charCount = charList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));		
		charCount.forEach((key, value) -> System.out.println(key+"->"+value));
		
 	}
	
	public static void duplicateCharsInStringJava8(String word) {
		char [] chars = word.toCharArray();
		List<Character> charList = new ArrayList<>();
		for(Character ch : chars) {
			charList.add(ch.toUpperCase(ch));
		}
		Map<Character, Long> charCount = charList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));		
		charCount.forEach((key, value) ->  {
			if(value>1)
			System.out.println(key+"->"+value);
		});
	}

}
