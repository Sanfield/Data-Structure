package HUAWEI;

import java.util.Scanner;

public class Demo12 {
	//·´ÏìÊäÈë¾ä×Ó
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
		String string=sc.nextLine();
		int len = string.length();
		String[] strs=string.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=strs.length-1;i>=0;i--)
			sb.append(strs[i]+" ");
		System.out.println(sb.substring(0,len));
		}
	
	}

}
