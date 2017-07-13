package HUAWEI;

import java.util.Scanner;

public class Demo27 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String string= sc.nextLine();
		StringBuffer sb= new StringBuffer();
		for(int j=0;j<string.length();j++){
			char c=string.charAt(j);
			if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
				sb.append(c);
			}else
				sb.append(" ");
		}
		String[]  str=sb.toString().split(" ");
		for(int j=str.length-1;j>1;j--){
			System.out.print(str[j]+" ");
		}
		if(str[0].length()==0){
			System.out.println(str[1]);
		}else{
			System.out.println(str[1]+" "+str[0]);
		}
	}

}
