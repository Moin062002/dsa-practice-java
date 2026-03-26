package com.ex;

import java.util.Arrays;

public class Anagrams {
	// Time: O(n), Space: O(1)
	public static boolean anagrams(String str1, String str2) {
    	if (str1.length() != str2.length()) {
      	  return false;
    	}
   	 int[] count = new int[26];
   	 for (int i = 0; i < str1.length(); i++) {
     	   count[str1.charAt(i) - 'a']++;
      	  count[str2.charAt(i) - 'a']--;
   	 }
   	 for (int c : count) {
      	  if (c != 0) {
        	    return false;
      	  }
    	}
  	  return true;
	}
	public static void main(String[] args) {
		String str1 ="race";
		String str2 ="care";
		System.out.println(anagrams(str1,str2));
	}
	
/* Time : O(n log n) , space: O(n)	
	public static void anagrams(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		// covert ot char array
		if(str1.length() == str2.length()) {
			char[] str1charArray = str1.toCharArray();
			char[] str2charArray = str2.toCharArray();
	   //   sort char array
			Arrays.sort(str1charArray);
			Arrays.sort(str2charArray);
	  //  check if both are same		
			boolean result = Arrays.equals(str1charArray, str2charArray);
			if(result) {
				System.out.println(str1+" and "+ str2 + " are anagram to each other");
			} else {
				System.out.println(str1+" and "+ str2 + " are not anagram to each other");
			}
		} else {
			System.out.println(str1+" and "+ str2 + " are not anagram to each other");
		}
	}
	public static void main(String[] args) {
		String str1 ="race";
		String str2 ="care";
		anagrams(str1,str2);
	}
	*/
}
