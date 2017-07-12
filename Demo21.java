package HUAWEI;

import java.util.Scanner;

public class Demo21 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		while(sc.hasNext()){
			n=sc.nextInt();
			System.out.println(Drink(n));
		}
	}
	public static int Drink(int n){
		if(n<=0)
			return 0;
		else if(n==3)
			return 1;
		else if(n==2)
			return 1;
		else{//此时表明为3的倍数
			int h=0;
			h=n/3;
			return h+Drink(n-3*h+h);
		}
	}

}
