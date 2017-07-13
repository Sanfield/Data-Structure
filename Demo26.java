package HUAWEI;

import java.util.Scanner;

public class Demo26 {
	public static final String str1="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static final String str2="BCDEFGHIJKLMNOPQRSTUVWXYZAbcdefghijklmnopqrstuvwxyza1234567890";
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			char[] aucPassword=s1.toCharArray();
			char[] password=s2.toCharArray();
			System.out.println(encode(aucPassword));
			System.out.println(unCode(password));
		}
	}
	private static String  encode(char[] aucPassword){

		StringBuffer sb= new StringBuffer();
		for(int i=0;i<aucPassword.length;i++){
			for(int j=0;j<str1.length();j++){
				char c= str1.charAt(j);
				if(c==aucPassword[i])
					sb.append(str2.charAt(j));
			}
		}
		return sb.toString();
	}
	private static String unCode(char password[]){
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<password.length;i++){
			for(int j=0;j<str2.length();j++){
				char c=str2.charAt(j);
				if(c==password[i])
					sb.append(str1.charAt(j));
						
			}
		}
		return sb.toString();
	}
}
