package HUAWEI;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo22 {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
		String str= sc.nextLine();
		char[] s= str.toCharArray();
		Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
		for(char a:s){
			if(!map.containsKey(a)){
				map.put(a, 1);
			}else{
				map.put(a, map.get(a)+1);
			}
		}
		Collection<Integer> al =map.values();
		int index= Collections.min(al);
		StringBuffer sb= new StringBuffer("");
		for(char a:s){
			if(map.get(a)!=index)
				sb.append(a);
		}
		System.out.println(sb.toString());
	}
	}
}
