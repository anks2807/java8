package com.stringoperations;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		System.out.println(isAnagram("Mother In Law".replaceAll("\\s", "").toLowerCase(), "Hitler Woman".replaceAll("\\s", "").toLowerCase()));
		System.out.println(isAnagram("School MASTER".replaceAll("\\s", "").toLowerCase(), "The ClassROOM".replaceAll("\\s", "").toLowerCase()));
		System.out.println(isAnagram("ASTRONOMERS".replaceAll("\\s", "").toLowerCase(), "NO MORaE STARS".replaceAll("\\s", "").toLowerCase()));
	}
	
	public static boolean isAnagram(String str1 , String str2) {
		if(str1.length() != str2.length()) {
			return false;
		} else {
			char[] stringCharArray1 = str1.toLowerCase().toCharArray();
			for(Character ch : stringCharArray1) {
				if(!str2.contains(ch+"")) {
					return false;
				}
			}
			return true;
		}
	} 

}
