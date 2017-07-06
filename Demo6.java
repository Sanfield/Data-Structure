package HUAWEI;

import java.util.Scanner;

public class Demo6 {
//求一个数的所有质数因子	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		long num= sc.nextLong();
		String reuslt=getResult(num);
		System.out.println(reuslt);
	}
	public static String getResult(long num){
		int pum=2;
		String result="";
		while(num!=1){
			while(num%pum==0){
				num=num/pum;
				result=result+pum+" ";
			}
			pum++;
		}
		return result;
	}
}
