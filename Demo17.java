package HUAWEI;

import java.math.BigInteger;
import java.util.Scanner;

public class Demo17 {
	private static int a= 0;//A
	private static int b=0;//B
	private static int c=0;//C
	private static int d=0;//d
	private static int e=0;//e
	private static int error=0;//错误IP
	private static int pri=0;//私有Ip
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String s= sc.next();
			checkIp(s);
			
		}
		System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+error+" "+pri);
		sc.close();;
	}
	private static void checkIp(String s){
		String str[]=s.split("~");
		String ip=str[0];
		String mask=str[1];
		String []ipParts=ip.split("\\.");
		String []maskParts=mask.split("\\.");
		int[] ipInt=new int[4];
		int[] maskInt=new int[4];
		//判断Ip是否是4部分组成
		if(ipParts.length!=4||maskParts.length!=4){
			error++;
			return;
			
		}
		for(int i=0;i<4;i++){
			if(" ".equals(ipParts[i])||" ".equals(maskParts[i])){
				error++;
				return;
			}
		}
		for(int i=0;i<4;i++){
			ipInt[i]=Integer.parseInt(ipParts[i]);
			maskInt[i]=Integer.parseInt(maskParts[i]);
			if(ipInt[i]>255|| maskInt[i]>255){
				error++;
				return ;
			}
		}
		String temp="";
		for(int i=0;i<maskParts.length;i++){
			BigInteger bi=new BigInteger(maskParts[i]);
			temp+=bi.toString(2);
	
		}
		//找到二进制格式中第一个0的位置
		int index=temp.indexOf("0");
		temp=temp.substring(index+1);
		if(temp.contains("1")){
			error++;
			return ;
		}
		if(ipInt[0]>=1&&ipInt[0]<=126)
			a++;
		if(ipInt[0]>=128&&ipInt[0]<=191)
			b++;
		if(ipInt[0]>=192&&ipInt[0]<=223)
			c++;
		if(ipInt[0]>=224&&ipInt[0]<=239)
			d++;
		if(ipInt[0]>=240&&ipInt[0]<=255)
			e++;
		if(ipInt[0]==10)
			pri++;
		if(ipInt[0]==172)
			if(ipInt[1]>=16&&ipInt[1]<=31)
				pri++;
		if(ipInt[0]==192){
			if(ipInt[1]==168)
				pri++;
			
		}
	}

}
