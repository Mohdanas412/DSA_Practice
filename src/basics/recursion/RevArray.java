// Problem : Recursion: Reverse a given Array.
// Approach : Use two pointers from both ends, swap their elements, move them toward the center, and reverse the array in-place.
// Time Complexity : O(n)  & Space Complexity : O(1) .
// Link : https://takeuforward.org/data-structure/reverse-a-given-array.

public class RevArray {

    static void reverseArray(int[] arr) {

        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 < p2) {

            // Swap elements
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;

            // Move pointers
            p1++;
            p2--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {5,7,4,3,9};

        reverseArray(arr);

        // Print reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}