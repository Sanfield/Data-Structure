package HUAWEI;

import java.util.HashSet;
import java.util.Scanner;

public class Demo32 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String pattern= sc.next();
			String word=sc.next();
			pattern= pattern.toLowerCase();
			word=word.toLowerCase();
			
			char[] table= new char[26];
			HashSet<Character> hs= new HashSet<Character>();
			int cnt=0;
			for(int j=0;j<pattern.length();j++){
				if(!hs.contains(pattern.charAt(j))){
					table[cnt]=pattern.charAt(j);
					cnt++;
				}
			}
			int c=0;
			while(cnt<26){
				char ch=(char)(c+97);
				if(!hs.contains(ch)){
					table[cnt]=ch;
					hs.add(ch);
					cnt++;
				}
				cnt++;
			}
			String res="";
			for(int k=0;k<word.length();k++){
				res+=String.valueOf(table[(int)word.charAt(k)-97]);
				
			}
			System.out.println(res);
		}
		sc.close();
	}

}
