package HUAWEI;

import java.util.Scanner;
//ʮ������ת10����
public class Demo5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.nextLine();
			s=s.substring(2);
			long l= Long.parseLong(s, 16);
			System.out.println(l);
		}
	}

}
