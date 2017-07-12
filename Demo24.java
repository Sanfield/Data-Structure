package HUAWEI;

import java.util.Scanner;

public class Demo24 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String str= sc.nextLine();
			char[] cha= str.toCharArray();
			StringBuffer sb= new StringBuffer();
			for(int i=0;i<26;i++){
				char c= (char)(i+'A');
				for(int j=0;j<str.length();j++){//以此把字符串中的abc...全部加入 sb
					if(cha[j]==c||cha[j]==(char)(c+32))
						sb.append(cha[j]);
				}
			}
			for(int k=0;k<str.length();k++){//字母以外的位置不变
				if(!(cha[k]>='A' &&cha[k]<='Z'||cha[k]>='a'&&cha[k]<='z'))
					sb.insert(k, cha[k]);
			}
			System.out.println(sb.toString());
		}
	}

}
