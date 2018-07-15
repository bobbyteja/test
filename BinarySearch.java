import java.io.*;
import java.util.*;

/*
 * Author : Raviteja Vutukuri 
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class BinarySearch {
  public static void main(String[] args) {

        int[] arr = {5,3,2,1,7,6,8,4};

        Arrays.sort(arr);

        int idx = binarySearch(arr,-2);

        if( idx == -1 )
          System.out.println("Element is not found!");
        else
          System.out.println("The index of the input element is "+idx);

    }

    public static int binarySearch(int[] arr,int element) {

          int low=0;
          int high=arr.length-1;
          int mid= low + ( high - 1 )/2 ;
          int val=0;

          while( low<=high ) {

              if( element < arr[mid] ) {

                  high = mid-1;
                  mid =  ( low + high )/2;

              }

             if( element > arr[mid] ) {
                  low = mid+1;
                  mid = ( low + high )/2;
              }

              if ( element == arr[mid] ) {
                   return mid;
              }

          }


          return -1;

    }

  }
