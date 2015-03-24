package com.finals.link.leetcode;

/**
 * Implement atoi to convert a string to an integer.
 */
public class StringtoInteger {
	public static int atoi(String str) {
		if (str == null) {
			return 0;
		}
		str = str.trim();
		if (str.length() == 0) {
			return 0;
		}

		int sign = 1;
		int index = 0;

		if (str.charAt(index) == '+') {
			index++;
		} else if (str.charAt(index) == '-') {
			sign = -1;
			index++;
		}
		long num = 0;
		for (; index < str.length(); index++) {
			if (str.charAt(index) < '0' || str.charAt(index) > '9')
				break;
			num = num * 10 + (str.charAt(index) - '0');
			if (num > Integer.MAX_VALUE && sign == 1) {
				break;
			}
		}
		if (num * sign > Integer.MAX_VALUE) {
			if (sign < 0) {
				return Integer.MIN_VALUE;
			}
			return Integer.MAX_VALUE;
		}
		if (num * sign < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		return (int) num * sign;
	}
}
