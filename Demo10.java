package HUAWEI;

import java.util.Scanner;

public class Demo10 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String str= sc.nextLine();
			int len=getLen(str);
			System.out.println(len);
		}
	}
	//判断不重复数的个数
	public static int getLen(String s){
		int[] arr=new int[128];
		for(int i=0;i<s.length();i++){
			arr[s.charAt(i)]=1;
		}
		int len=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==1){
				len++;
			}
		}
		return len;
	}
	
}
