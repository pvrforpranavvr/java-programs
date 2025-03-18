package edu.pvr.programs.largest_number;

import java.util.Arrays;

public class LargestNumberInArray {
    
    public static int findLargestNumberInAnArray(int[] numbers) {
        int largestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        return largestNumber;
    }

    public static int findLargestNumberInAnArrayUsingJava8(int[] numbers) {
        return Arrays.stream(numbers)
                .max()
                .orElse(0);
    }

    public static void main(String[] args) {
        System.out.println("Largest number is: " + findLargestNumberInAnArray(new int[]{2, 4, 1, 5}));
        System.out.println("Largest number is: " + findLargestNumberInAnArray(new int[]{5, 1, 2, 3, 4}));

        System.out.println("Largest number using stream is: " + findLargestNumberInAnArrayUsingJava8(new int[]{2, 4, 1, 5}));
        System.out.println("Largest number using stream is: " + findLargestNumberInAnArrayUsingJava8(new int[]{5, 1, 2, 3, 4}));
    }
}
