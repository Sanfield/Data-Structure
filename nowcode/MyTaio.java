package com.merit.leetcode;

/**
 * @Author: sangfei
 * @Date: 2019/3/16 18:03
 * @Description:
 */
public class MyTaio {
    public int myAtoi(String str) {
        if(str.length()==0|| str==""){
            return 0;
        }
        int flag=1,i=0;
        long result=0;
        while (i<str.length() && str.charAt(i)== ' '){
            i++;
        }
        if(i== str.length()){
            return 0;
        }
        if(str.charAt(i)=='+'|| str.charAt(i)=='-'){
            flag=str.charAt(i)=='+'?1:-1;
            i++;
        }
        while (i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9'){
            result =10*result+(str.charAt(i)-'0');
            i++;
            if(result>Integer.MAX_VALUE){
                return flag==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
        }
        return Integer.parseInt(String.valueOf(result*flag));
    }
}
