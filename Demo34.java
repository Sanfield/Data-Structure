package HUAWEI;

import java.util.Scanner;

//求小球落下的高度
public class Demo34 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			double h=sc.nextDouble();
			double[] res=getJourney(h);
			
			System.out.println(res[0]);
			System.out.println(res[1]);
		}
		sc.close();
	}
	public static double[] getJourney(double h){
		int count =1;
		double sum=h;
		double[] res= new double[2];
		while(count<5){
			h=h*1.0/2;
			sum+=2*h;
			count++;
					
		}
		res[0]=sum;
		res[1]=h*1.0/2;
		return res;
	}
}
