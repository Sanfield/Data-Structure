import java.util.Scanner;

public class AllList {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String str= sc.next();
			if(str==null ||str.length()==0){
				System.out.println(0);
			}
			char c1= str.charAt(0);
			int count =1;
			for(int i=1;i<str.length();i++){
				char c=str.charAt(i);
				if(c1 != c){
					count++;
					c1=c;
				}
			}
			System.out.println(count);
	}
		

}
}
