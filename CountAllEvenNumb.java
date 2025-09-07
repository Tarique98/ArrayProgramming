// Quest-3 -> WAJP to count all the even numbers of the array.
package arrayProgramming;

public class CountAllEvenNumb {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 9, 14, 16};
        int count = 0;

        System.out.println("Even numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                count++;
            }
        }

        System.out.println("Total count of even numbers = " + count);
    }
}
