package rongzhe.leetcode.onehundred;

import org.junit.Test;

public class A0002_AddTwoNumber {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	@Test
	public void main() {
		System.out.println("AddTwoNumbers ListNode");
		final ListNode num1 = init(new int[] { 1, 2, 3 });
		final ListNode num2 = init(new int[] { 1, 2, 3 });
		ListNode ret = addTwoNumbers(num1, num2);
		while (ret.next != null) {
			System.out.println(ret.val);
			ret = ret.next;
		}
	}

	private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		final ListNode ret = new ListNode();
		ListNode current = ret;
		while (true) {
			current.val = current.val + (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
			boolean carry = false;
			if (current.val >= 10) {
				carry = true;
				current.val = current.val % 10;
			}
			final ListNode next = new ListNode();
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
			if (carry) {
				next.val = 1;
			} else {
				if (l1 == null && l2 == null) {
					break;
				}
			}
			current.next = next;
			current = current.next;
		}
		return ret;
	}

	private ListNode init(int[] nums) {
		final ListNode ret = new ListNode();
		ListNode current = ret;
		for (int i = 0; i < nums.length; i++) {
			final ListNode next = new ListNode();
			current.val = nums[i];
			current.next = next;
			current = current.next;
		}

		return ret;

	}

}
