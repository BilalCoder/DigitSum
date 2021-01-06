package com.company;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int sum = digitSum(input1);
        System.out.println(sum);
    }

    public static int digitSum(int input1) {
        boolean flag = false;
        if(input1<0){
            flag = true;
            input1 = -input1;
        }
        int sum = 0;
        while (input1 > 0 || sum > 10){
            if(input1==0){
                input1 = sum;
                sum = 0;
            }
            sum = sum + (input1%10);
            input1 = input1 / 10;
        }
        return (flag?-sum:sum);
    }
}

