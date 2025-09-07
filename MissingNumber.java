package arrayProgramming;

public class MissingNumber 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 4, 5, 6}; // 3 missing hai

        int n = arr.length + 1; // total elements hone chahiye N

        int totalsum = n * (n + 1) / 2; // 1 to N ka sum

        int arrsum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrsum = arrsum + arr[i];  // array ka sum
        }

        int missing = totalsum - arrsum;

        System.out.println("Missing Number is: " + missing);
    }
}
