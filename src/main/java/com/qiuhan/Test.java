package com.qiuhan;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public int search(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = (left + right) / 2;
            if (nums[pivot] == target) return pivot;
            else {
                if (target < nums[pivot]) right = pivot - 1;
                else left = pivot + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] str = s.toCharArray();
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < str.length; i++) {

            if (str[i] >= '0' && str[i] <= '9') {

                buf.append(str[i]);
            }
        }

        String st = buf.toString();
        char[] arr = st.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


}

