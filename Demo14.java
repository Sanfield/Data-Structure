package HUAWEI;

import java.util.Scanner;

public class Demo14 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		String b=Integer.toBinaryString(num);//十进制转二进制
	//	System.out.println(b);
		int count=0;
		for(int i=0;i<b.length();i++){
		//	System.out.println(b.charAt(i));
			if(b.charAt(i)=='1')
				count++;
		}
		System.out.println(count);
	}

}
