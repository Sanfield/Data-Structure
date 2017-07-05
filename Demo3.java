package HUAWEI;

import java.util.HashSet;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<=num;i++){
			set.add(sc.nextLine());
		}
		for(String value:set)
			System.out.println(value);
	}

}
