package week1.day1.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
        Arrays.sort(arr);
        System.out.println("Missing Number is:" + getMissingNumber(arr));
    }

    public static Integer getMissingNumber(int[] arr) {
        Integer missed = null;
        for (int i = 0; i < arr.length; i++) {
            int index = i + 1;
            if (arr[i] != index) {
                missed = index;
                break;
            }
        }
        return missed;
    }
}