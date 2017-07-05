package HUAWEI;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String[] str= s.split(" ");
		int length= str.length;
		System.out.println(str[length-1].length());
		
	}

}
