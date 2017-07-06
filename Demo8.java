package HUAWEI;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Demo8 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		SortedMap<Integer,Integer> map= new TreeMap<Integer,Integer>();
		int n= Integer.parseInt(sc.nextLine());
		//把数据存入map
		for(int i=0;i<n;i++){
			String[] mid= sc.nextLine().split("\\s");
			int key=Integer.parseInt(mid[0]);
			int value=Integer.parseInt(mid[1]);
			if(map.containsKey(key)){
				map.put(key, map.get(key)+value);
			}else{
				map.put(key, value);
			}
			
		}
		//输出
		Iterator<Map.Entry<Integer,Integer>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Entry<Integer,Integer> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
