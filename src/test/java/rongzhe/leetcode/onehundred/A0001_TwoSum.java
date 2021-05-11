package rongzhe.leetcode.onehundred;

import org.junit.Test;

public class A0001_TwoSum {

	@Test
	public void main() {

		final int[] input = new int[4];
		input[0] = 2;
		input[1] = 7;
		input[2] = 11;
		input[3] = 15;
		System.out.println(input.toString());
		System.out.println(twoSum(input, 9)[0] + "+" + twoSum(input, 9)[1]);
	}

	private int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("fail");

	}
}
