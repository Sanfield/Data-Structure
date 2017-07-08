package HUAWEI;

import java.util.Arrays;
import java.util.Scanner;

public class Demo13 {
	//°´×ÖµäÅÅÐò ×Ö·û´®
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		String[] ss=new String[num];
		for(int i=0;i<num;i++)
			ss[i]=sc.next();
		Arrays.sort(ss);
		for(int i=0;i<ss.length;i++)
			System.out.println(ss[i]);
	}

}
