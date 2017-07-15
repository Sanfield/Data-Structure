package HUAWEI;

import java.util.Scanner;

public class Demo33 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			int x= sc.nextInt();
			System.out.println(FeiBonice(x));
		}
	}
	private static int FeiBonice(int n){
		if(n==1||n==2)
			return 1;
		else
			return FeiBonice(n-1)+FeiBonice(n-2);
	}

}
