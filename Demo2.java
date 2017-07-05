package HUAWEI;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String string1 = sc.nextLine();
		String string2= sc.nextLine();
		string1=string1.toLowerCase();
		string2=string2.toLowerCase();
		byte[] str= string1.getBytes();
		byte[] str1=string2.getBytes();
		int count=0;
		for(int i=0;i<str.length;i++){
			if(str1[0]==str[i])
				count++;
		}
		System.out.println(count);
	}

}
