package com.meituan.demo;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=0,count=0;
		while(sc.hasNext()){
			int n=sc.nextInt();
			int[] str= new int[n];
			for(int i=0;i<n;i++){
				str[i]=sc.nextInt();
			}
			int k= sc.nextInt();
			for(int j=0;j<n;j++){
				count+=j;
				if(count%k==0)
					num++;
			}
			System.out.println(num);
			
		}
		
	}

}
