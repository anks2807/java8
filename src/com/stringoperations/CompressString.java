package com.stringoperations;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompressString {

	public static void main(String[] args) {
		compressString("a$%&^abbcccdee-+;:@#$%&^*");
	}
	
	public static void compressString(String word) {
		word = word.replaceAll("[-+;:@#$%&^*]", "");
		System.out.println(word);
		Map<Character, Integer> charCount = new HashMap<>();
		
		for(Character ch : word.toCharArray()) {
			if(charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch)+1);
			}else {
				charCount.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = charCount.entrySet();
		Iterator<Entry<Character, Integer>> itr = entrySet.iterator();
		String output = "";
		while(itr.hasNext()) {
			Entry<Character, Integer> entry = itr.next();
			if(entry.getValue() >1) {
				output = output + entry.getValue() + entry.getKey();
			}else {
				output = output + entry.getKey();
			}
			
		}
		
		System.out.println("compressed string "+output);
	}
 
}
