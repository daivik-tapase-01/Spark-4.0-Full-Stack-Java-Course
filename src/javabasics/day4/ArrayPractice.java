package javabasics.day4;

public class ArrayPractice {
    public static void main(String[] args) {
        // 1-> sum of elements
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        System.out.println("sum of array elements: " + sum1);

        // 2-> find the maximum element
        int[] arr2 = { 7, 2, 9, 4 };
        int max = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (max < arr2[i]) {
                max = arr2[i];
            }
        }
        System.out.println("max element is: " + max);

        // 3-> count even and odd
        int[] arr3 = { 2, 3, 5, 6, 8 };
        int even = 0, odd = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("even count: " + even + ", odd count: " + odd);

        // 4-> reverse an array
        int[] arr4 = { 1, 2, 3, 4 };
        int start = 0;
        int end = arr4.length - 1;

        System.out.print("Initial array: ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        while (start < end) {
            int temp = arr4[start];
            arr4[start] = arr4[end];
            arr4[end] = temp;

            start++;
            end--;
        }
        System.out.print("\nReverse array: ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }

        // 5-> print all pairs
        System.out.print("\nall pairs: ");
        int[] arr5 = { 1, 2, 3 };
        for (int i = 0; i < arr5.length; i++) {
            for (int j = i + 1; j < arr5.length; j++) {
                System.out.print("(" + arr5[i] + "," + arr5[j] + ") ");
            }
        }

        // 6-> second largest element
        System.out.println();
        int[] arr6 = { 5, 3, 8, 6 };
        int max6 = arr6[0];
        int secondMax = arr6[0];

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > max6) {
                secondMax = max6;
                max6 = arr6[i];
            } else if (arr6[i] > secondMax && arr6[i] != max6) {
                secondMax = arr6[i];
            }
        }
        System.out.println("Second Largest: " + secondMax);

        // 7-> check the palindrome array
        int[] arr7 = { 1, 2, 3, 2, 1 };
        boolean isPalindrome = true;
        int first = 0;
        int last = arr7.length - 1;
        while (first < last) {
            if (arr7[first] != arr7[last]) {
                isPalindrome = false;
                break;
            }
            first++;
            last--;
        }
        if (isPalindrome) {
            System.out.println("the array is palindrome.");
        } else {
            System.out.println("the array is not palindrome.");
        }

        // 8-> frequency counter
        int[] arr8 = { 1, 2, 1, 3, 2, 1 };
        for (int i = 0; i < arr8.length; i++) {
            int count = 1;
            boolean countedBefore = false;

            // check if the number was already counted
            for (int j = 0; j < i; j++) {
                if (arr8[i] == arr8[j]) {
                    countedBefore = true;
                    break;
                }
            }

            if (!countedBefore) {
                // count occurrences of arr[i]
                for (int j = i + 1; j < arr8.length; j++) {
                    if (arr8[i] == arr8[j]) {
                        count++;
                    }
                }
                System.out.println(arr8[i] + ": " + count);
            }

        }

        // 9-> rotate array left by 1
        int[] arr9 = { 10, 20, 30, 40 };
        int firstEle = arr9[0];
        for (int i = 0; i < arr9.length - 1; i++) {
            arr9[i] = arr9[i + 1];
        }
        arr9[arr9.length - 1] = firstEle;

        for (int i = 0; i < arr9.length; i++) {
            System.out.print(arr9[i] + " ");
        }

        // 10-> find duplicate elements
        System.out.println();
        int[] arr10 = { 1, 2, 3, 2, 4, 1 };
        for (int i = 0; i < arr10.length; i++) {
            for (int j = i + 1; j < arr10.length; j++) {
                if (arr10[i] == arr10[j]) {
                    System.out.print(arr10[j] + " ");
                }
            }
        }

    }
}
