package com.stringoperations;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestStringOfNonRepeatingChars {

	public static void main(String[] args) {
		longestStringOfNonRepeatingChars("Javaconceptoftheday");
	}

	public static void longestStringOfNonRepeatingChars(String string){
		Map<Character, Integer> nonRepMapChars = new LinkedHashMap<Character, Integer>();
		int longestNonRepeatingChars = 0;
		String longestNonRepeatingSubStr = null;
		char[] charArr = string.toLowerCase().toCharArray();

		for(int i=0 ; i < charArr.length;i++){
			if(!nonRepMapChars.containsKey(charArr[i])) {
				nonRepMapChars.put(charArr[i], i);
			} else{
				i= nonRepMapChars.get(charArr[i]);
				nonRepMapChars.clear();
			}

			if(nonRepMapChars.size() > longestNonRepeatingChars) {
				longestNonRepeatingChars = nonRepMapChars.size();
				longestNonRepeatingSubStr = nonRepMapChars.keySet().toString();
			}
		}

		System.out.println("longest number of non repeating substring"+ longestNonRepeatingChars);
		System.out.println("longest non repeating substring"+ longestNonRepeatingSubStr);

	}
	
	public static void longestStringOfRepeatingChars(String str) {
		
		char [] charArray = str.toLowerCase().toCharArray();
		int longestRepeatingCharLength;
		for(int i=0 ; i < charArray.length; i++ ) {
			
		}
	}

}

class Index{
	int startIndex;
	int endIndex;
	Character ch;
}


