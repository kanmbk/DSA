package com.mbk.learning.dsa;

public class BinarySearchDemo {

    public static void main(String[] args){
        
        //int[] numArray = {4,9,11,15,17,22};
        //int searchTarget = 17;
        int[] numArray = new int[5000];
        int searchTarget = 4000;

        int index = BinarySearch(numArray, searchTarget);

        if(index != -1){
            System.out.println("Element " + searchTarget + " found at index: " + index);
        } else {
            System.out.println("Element " + searchTarget + " not found in the array.");
        }
    }

    static int BinarySearch(int[] numArray, int searchTarget) {
        int steps = 0;
        int left = 0;
        int right = numArray.length - 1;

        while(left <= right){
            steps++;
            int mid = (left + right) / 2;
            if(numArray[mid] == searchTarget){
                System.out.println("Steps taken by binary search: " + steps);
                return mid;
            }else if (numArray[mid] < searchTarget){
                left = mid +1;
            }else
                right = mid + 1;
        }
        System.out.println("Steps taken by binary search: " + steps);
        return -1;
        
    }
}
