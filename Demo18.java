package HUAWEI;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Demo18 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//LinkHashMap记录插入的顺序
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		String key;
		String fileName;
		String path;
		while(sc.hasNext()){
			path= sc.next();
			int id=path.lastIndexOf("\\");
			fileName= id<0?path:path.substring(id+1);
			int linenum= sc.nextInt();
			key = fileName+" "+linenum;
			if(map.containsKey(key)){//如果存在错误
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}
		}
		sc.close();
		//对数据进行排序
		List<Map.Entry<String, Integer>> list= new LinkedList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {
			//降序
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return(o2.getValue()-o1.getValue()==0?(o1.getValue()-o2.getValue()):(o2.getValue()-o1.getValue()));
				
			}
			
		});
		//只输出前8条
		int m=0;
		for(Map.Entry<String, Integer>mapping :list){
			m++;
			if(m<=8){
				String[] str=mapping.getKey().split(" ");
				String k=str[0].length()>16?str[0].substring(str[0].length()-16):str[0];
				String n=str[1];
				System.out.println(k+" "+n+" "+mapping.getValue());
				
			}else{
				break;
			}
		}
	}

}
