package com.finals.link.leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String prefix = strs[0];
		int j = 0;
		for (int i = 1; i < strs.length; i++) {
			j = 0;
			while (j < strs[i].length() && j < prefix.length()
					&& strs[i].charAt(j) == prefix.charAt(j)) {
				j++;
			}
			if (j == 0)
				return "";
			prefix = prefix.substring(0, j);
		}
		return prefix;
	}
}
