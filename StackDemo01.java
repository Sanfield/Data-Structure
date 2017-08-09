package borderview;

import java.util.Stack;

public class StackDemo01 {
	static String[] months={"January","Febrary","March","April","May",
			"June","July","August","September","October","November"};
	public static void main(String args[]){
		Stack stk= new Stack();
		for(int i=0;i<months.length;i++){
			stk.push(months[i]);
		}
		System.out.println("stk:"+stk);
		while(!stk.isEmpty())
			System.out.print(stk.pop()+" ");
	}
}
