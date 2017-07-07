package HUAWEI;

import java.util.Scanner;

public class Demo9 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String num= sc.nextLine();
		int len=num.length();
		int[] arry=new int[10];
		for(int i=len-1;i>=0;i--){
			if(arry[num.charAt(i)-48]==0){//判断是否存在
				System.out.print(num.charAt(i)-48);
				arry[num.charAt(i)-48]++;//存在为1
			}
		}
	}
}
