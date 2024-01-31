package org.example.Recursion;

// 1. Termination Condition
// 2. Logic
// 3. Recursive Call

import java.util.Scanner;

public class RecursionEx1 {

    int arr[]={2};
    int i=0;

    void recur(int[] arr){
        if(i<arr.length) {                  // 1. Termination Condition
            System.out.println(arr[i]);     // 2. Logic
            i++;
            recur(arr);                     // 3. Recursive Call
        } else
            System.out.println("length is not match");
    }

    int fact(int n){

          if (n==1||n==0){
              return n;
          }else {
              int x = n * fact(n - 1);
              return x;
          }

    }

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        RecursionEx1 re=new RecursionEx1();
        re.recur(re.arr);
        System.out.println("enter fact value");
        System.out.println(re.fact( s.nextInt()));

    }

}
