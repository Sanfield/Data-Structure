package HUAWEI;

import java.util.Scanner;

//动态规划，最长递增子数列
public class Demo23 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			int n= sc.nextInt();
			int temp=0;
			int[] Inc= new int[n];
			int[] Dec=new int[n];
			int[] arr= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			Inc[0]=1;//增序
			for(int i=1;i<n;i++){
				Inc[i]=1;
				for(int j=0;j<i;j++){
					if(arr[j]<arr[i]&&Inc[j]+1>Inc[i]){//Inc[j]+1>Inc[i]保证一直是增的
						Inc[i]=Inc[j]+1;
					}
				}
			}
			Dec[n-1]=1;//递减
			for(int i=n-2;i>=0;i--){
				Dec[i]=1;
				for(int j=n-1;j>i;j--){
					if(arr[j]<arr[i]&&Dec[j]+1>Dec[i]){
						Dec[i]=Dec[j]+1;
					}
				}
			}
			for(int i=0;i<n;i++){
				if(Inc[i]+Dec[i]-1>temp){
					temp=Inc[i]+Dec[i]-1;
				}
			}
			System.out.println(n-temp);
		}
	}

}
