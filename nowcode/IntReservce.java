package com.merit.leetcode;

/**
 * @Author: sangfei
 * @Date: 2019/3/16 16:22
 * @Description:
 */
public class IntReservce {
    public int reverse(int x){
        if(x<Integer.MIN_VALUE || x>=Integer.MAX_VALUE){
            return 0;
        }
        int z=0;
        int n=0;
        while (x!=0){
            n++;
            if (n==10){
                if (x<0){
                    if (z<Integer.MIN_VALUE/10){
                        return 0;
                    }
                }
                else{
                    if (z>Integer.MAX_VALUE/10){
                        return 0;
                    }
                }
            }
            z=z*10+x%10;
            x/=10;
        }
        return z;
    }
}
