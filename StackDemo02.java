package borderview;

import java.util.Vector;

public class StackDemo02 {
	static String[] months={"January","Febrary","March","April","May",
			"June","July","August","September","October","November"};
	public static void main(String[] args) {
		Vector vq= new Vector();
		for(int i=0;i<months.length;i++){
			vq.add(months[i]);
		}
		if(vq.isEmpty())
			System.out.println("kong");
		while(!vq.isEmpty()){
			System.out.print(vq.lastElement()+" ");
			vq.removeElement(vq.lastElement());
		}
		vq.clear();
	}
	

}
