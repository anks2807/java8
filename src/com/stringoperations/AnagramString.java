package com.stringoperations;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		System.out.println(isAnagram("Mother In Law".replaceAll("\\s", "").toLowerCase(), "Hitler Woman".replaceAll("\\s", "").toLowerCase()));
		System.out.println(isAnagram("School MASTER".replaceAll("\\s", "").toLowerCase(), "The ClassROOM".replaceAll("\\s", "").toLowerCase()));
		System.out.println(isAnagram("ASTRONOMERS".replaceAll("\\s", "").toLowerCase(), "NO MORaE STARS".replaceAll("\\s", "").toLowerCase()));
		swap("Java", "J2EE");
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
	
	public static void swap(String s1 , String s2) {
		if(s1 !=null && s2 !=null) {

			System.out.println("Before Swapping "+ s1+","+ s2);
			s1 = s1+s2;
			s2 = s1.substring(0, s1.length()- s2.length());
			s1 = s1.substring(s2.length());
			
			System.out.println("After Swapping "+ s1+","+ s2);
		}
	}

}
