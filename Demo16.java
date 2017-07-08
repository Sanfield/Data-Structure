package HUAWEI;

import java.util.Scanner;

public class Demo16{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		String[] a= str.split(";");
		int x=0,y=0;
		for(String string:a){
			if(string.charAt(0)=='A'&&string.substring(1).matches("[0-9]+"))
				x-=Integer.parseInt(string.substring(1));
			
			if(string.charAt(0)=='W'&&string.substring(1).matches("[0-9]+"))
				y+=Integer.parseInt(string.substring(1));
			if(string.charAt(0)=='S'&&string.substring(1).matches("[0-9]+"))
				y-=Integer.parseInt(string.substring(1));
			if(string.charAt(0)=='D'&&string.substring(1).matches("[0-9]+"))
				x+=Integer.parseInt(string.substring(1));
		}
		System.out.println(x+","+y);
	}
}