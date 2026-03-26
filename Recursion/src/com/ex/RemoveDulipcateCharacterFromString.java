package com.ex;

public class RemoveDulipcateCharacterFromString {
	public static void removeDulipcateCharacterFromString(String str,int i,StringBuilder sb,boolean map[]) {
		if(i == str.length()) {
			System.out.println(sb);
			return;
		}
		char currchar = str.charAt(i);
		if(map[currchar-'a'] == true) {
			removeDulipcateCharacterFromString(str, i+1, sb, map);
		}else {
			map[currchar - 'a'] = true;
			removeDulipcateCharacterFromString(str, i+1, sb.append(currchar), map);
		}
	}
	public static void main(String[] args) {
		removeDulipcateCharacterFromString("appnnaacollege", 0, new StringBuilder(""),new boolean[26]);
	}
}
