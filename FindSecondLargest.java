package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] nums = {20,60,70,50,80};
		Arrays.sort(nums);
		for(int i=nums.length-2;i>2;i--)
		 System.out.println(nums[i]);
		}

	}


