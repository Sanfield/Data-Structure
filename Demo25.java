package HUAWEI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Demo25 {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			int num= sc.nextInt();
			String[]s =new String[num];
			int count=0;
			for(int i=0;i<num;i++){
				s[i]=sc.next();
			}
			String key=sc.next();//要寻找的单词
			char[] keychar=key.toCharArray();
			Arrays.sort(keychar);
			int no= sc.nextInt();//输出第几个
			ArrayList<String> list= new ArrayList<String>();
			for(int i=0;i<num;i++){
				int c= check(key, s[i], keychar);
				count+=c;
				if(c==1)
					list.add(s[i]);
			}
			System.out.println(count);
			Collections.sort(list);
			if(count>=0)
				System.out.println(list.get(no-1));
		}
	}
	private static int check(String key,String word,char[] keyChar){
		if(key.equals(word)||key.length()!=word.length())
			return 0;
		char[] wordchar=word.toCharArray();
		Arrays.sort(wordchar);
		return Arrays.equals(keyChar,wordchar)?1:0;
		
	}

}
