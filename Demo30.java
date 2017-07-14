package HUAWEI;

import java.util.Arrays;
import java.util.Scanner;

public class Demo30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
		String str= sc.nextLine();
		char[] strs= str.toCharArray();
		Arrays.sort(strs);
		System.out.println(strs);
		}
	}

}
