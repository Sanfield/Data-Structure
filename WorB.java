import java.util.Scanner;

public class WorB {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String str= sc.next();
			if(str==null ||str.length()<3 ||str.length()>50){
				return;
			}
			int count1=0;
			for(int i=0;i<str.length();i++){
				char c= str.charAt(i);
				if(i%2==0 &&c!='B'){
					count1++;
				}else if(i%2!=0 &&c!='W'){
					count1++;
				}
			}
			int count2=0;
			for(int i=0;i<str.length();i++){
				char c= str.charAt(i);
				if(i%2==0 &&c!='W'){
					count1++;
				}else if(i%2!=0 &&c!='B'){
					count2++;
				}
			}
			int result= count1<=count2?count1:count2;
			System.out.println(result);
		}
		
		
	}

}
