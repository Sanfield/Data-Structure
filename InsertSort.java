package datagroup;

public class InsertSort {
	private int n;
	private long[] a;
	public InsertSort(int max){
		 a = new long[max];
		 n=0;
	}
	public void insert(long value){
		a[n]=value;
		n++;
	}
	public void display(){
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	//²åÈëÅÅÐò
	public void insertSort(){
		int out,in;
		for(out=1;out<n;out++){
			long temp=a[out];
			in=out;
			while(in>0 && a[in-1]>=temp){
				a[in]=a[in-1];
				in--;
			}
			a[in]=temp;
		}
	}

}
