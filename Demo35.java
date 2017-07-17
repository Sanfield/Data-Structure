package HUAWEI;

import java.util.Scanner;

public class Demo35 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String s= sc.nextLine();
			String s1= sc.nextLine();
			String s2= sc.nextLine();
			if(s==null||s.length()==0||s1==null||s1.length()==0||s2==null||s2.length()==0){
				System.out.println(1);//非法地址
				break;
			}
			String ss[]=s.split("\\.");
			String ss1[]=s1.split("\\.");
			String ss2[]=s2.split("\\.");
			for(int i=0;i<ss.length;i++){
				if(Integer.valueOf(ss[i])<0||Integer.valueOf(ss[i])>255||Integer.valueOf(ss1[i])<0||Integer.valueOf(ss1[i])>255||Integer.valueOf(ss2[i])<0||Integer.valueOf(ss2[i])>255){
					System.out.println(1);
					break;
				}else if((Integer.valueOf(ss[i]) & Integer.valueOf(ss1[i])) == (Integer.valueOf(ss[i]) & Integer.valueOf(ss2[i]))){
					System.out.println(0);
				}else{
					System.out.println(2);//不属于同一网络
					break;
				}
			}
		}
	}

}
