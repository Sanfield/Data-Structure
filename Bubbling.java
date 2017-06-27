package datagroup;

public class Bubbling {
	private long[] a;
	private int n;
	public Bubbling(int max){
		a= new long[max];
		n=0;
	}
	public void insert(long value){
		n++;
		a[n]=value;
	}
	public void display(){
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public void bubbleSort(){
		int out,in;
		for(out=n-1;out>1;out--){
			for(in=0;in<out;in++){
				if(a[in]>a[in+1]){
					long x;
					x=a[in];
					a[in]=a[in+1];
					a[in+1]=x;
				}
			}
		}
		
	}

}
