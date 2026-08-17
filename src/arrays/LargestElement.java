// Problem : Array : Find the Largest element in an array .
// Approach : “Traverse the array once, continuously compare elements, and keep updating the largest value found so far.” 
// Time Complexity : O(N),  & Space Complexity : O(1) .
// Link : https://takeuforward.org/data-structure/find-the-largest-element-in-an-array.

package arrays;
public class LargestElement {

    static int findLargest(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {4, 7, 2, 0, 1};

        int largest = findLargest(arr);

        System.out.println("Largest element: " + largest);
    }
}