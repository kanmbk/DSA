package com.mbk.learning.dsa;
public class LinearSerchDemo {
 
    public static void main(String[] args){
        
        //int[] numArray = {4,9,11,15,17,22};
        //int searchTarget = 11;
        int[] numArray = new int[5000];
        int searchTarget = 4000;

        int index = linearSearch(numArray, searchTarget);

        if(index != -1){
            System.out.println("Element " + searchTarget + " found at index: " + index);
        } else {
            System.out.println("Element " + searchTarget + " not found in the array.");
        }
    }

    static int linearSearch(int[] numArray, int searchTarget){
        int steps = 0;
        for(int i=0; i<numArray.length; i++){
            steps++;
            if(numArray[i] == searchTarget){
                System.out.println("Steps taken by linear search: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear search: " + steps);    
        return -1;
    }
}
