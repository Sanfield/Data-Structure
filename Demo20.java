package HUAWEI;

import java.util.Scanner;

public class Demo20 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String password= sc.nextLine();
	System.out.println(changePass(password));
	}
	public static String changePass(String password){
		char[] str=password.toCharArray();
		StringBuffer pp= new StringBuffer();
		for(int i=0;i<str.length;i++){//依次判断
			if(str[i]>='a'&&str[i]<='c') pp.append(2);
			else if(str[i]>='d'&&str[i]<='f') pp.append(3);
			else if(str[i]>='g'&&str[i]<='i') pp.append(4);
			else if(str[i]>='j'&&str[i]<='l') pp.append(5);
			else if(str[i]>='m'&&str[i]<='o') pp.append(6);
			else if(str[i]>='p'&&str[i]<='s') pp.append(7);
			else if(str[i]>='t'&&str[i]<='v') pp.append(8);
			else if(str[i]>='w'&&str[i]<='z') pp.append(9);
			else if(str[i]>='A'&&str[i]<='Z')
				pp.append(Character.toLowerCase((char)(str[i]+1)));
				//System.out.println(Character.toLowerCase((char)(str[i]+1)));
			else
				pp.append(str[i]);
		}
		return pp.toString();
	}

}
