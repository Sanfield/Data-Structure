package HUAWEI;

import java.util.Scanner;

public class Demo15 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum_money=0;
		int num=0;
		sum_money=sc.nextInt();//获得总资金
		num=sc.nextInt();//物品总数
		int paice[]=new int[num];
		int val[]=new int[num];
		int []q= new int[num];
		for(int i=0;i<num;i++){
			paice[i]=sc.nextInt();
			val[i]=sc.nextInt()*paice[i];
			q[i]=sc.nextInt();
		}
		int [][] dp=new int[num][num];
		for(int i=0;i<num;i++){
			for(int j=0;j<sum_money;j++){
				if(q[i]==0){//附属物品
					if(paice[i]<=j)
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-paice[i]+val[i]]);
					
				}
				if(q[i]>0){//主件
					if(paice[i]+paice[q[i]]<=j)
						dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-paice[i]-paice[q[i]]]+val[i]+val[q[i]]);
				}
			}
		}
		System.out.println(dp[num][sum_money]);
	}
}
