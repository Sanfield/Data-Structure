package HUAWEI;

import java.util.Scanner;

public class Demo29 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextLine()){
			String str1=sc.nextLine();
			String str2=sc.nextLine();
			ipToInt(str1);
			intToIp(str2);
		}
	}
	public static void ipToInt(String ip){
		String[] strs=ip.split("\\.");
		int result=0;
		result=(Integer.parseInt(strs[0])<<24)
			+(Integer.parseInt(strs[1])<<16)
			+(Integer.parseInt(strs[2])<<8)
			+(Integer.parseInt(strs[3]));
		System.out.println(result);
	}
	public static void intToIp(String ip){
		int iIp=Integer.parseInt(ip);
		System.out.println(
				(iIp>>24)+"."+
		((iIp>>16)&255)+"."+
		((iIp>>8)&255)+"."+
		((iIp)&255)
				);
	}
}
