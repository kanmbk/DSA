package com.mbk.learning.dsa;

public class BinarySearchDemo {

    public static void main(String[] args){
        
        int[] numArray = {4,9,11,15,17,22};
        int searchTarget = 17;
        //int[] numArray = new int[5000];
        //int searchTarget = 4000;

        //int index = BinarySearch(numArray, searchTarget)
        int index = binarySearch(numArray, searchTarget, 0, numArray.length - 1);

        if(index != -1){
            System.out.println("Element " + searchTarget + " found at index: " + index);
        } else {
            System.out.println("Element " + searchTarget + " not found in the array.");
        }
    }

    static int binarySearch(int[] numArray, int searchTarget, int left, int right) {
        //int steps = 0;
        //int left = 0;
        //int right = numArray.length - 1;

        // while(left <= right){
        //     steps++;
        //     int mid = (left + right) / 2;
        //     if(numArray[mid] == searchTarget){
        //         System.out.println("Steps taken by binary search: " + steps);
        //         return mid;
        //     }else if (numArray[mid] < searchTarget){
        //         left = mid +1;
        //     }else
        //         right = mid + 1;
        // }

        // Recursive binary search
        if(left <= right){
            int mid = (left + right) / 2;
            if(numArray[mid] == searchTarget){
                return mid;
            }else if(numArray[mid] < searchTarget){
                return binarySearch(numArray, searchTarget, mid+1, right);
            }else{
                return binarySearch(numArray, searchTarget, left, mid-1);
            }
        }

        //System.out.println("Steps taken by binary search: " + steps);
        return -1;
        
    }
}
