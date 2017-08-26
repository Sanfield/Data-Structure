package sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		int a[]={7,5,5,8,67,8,13,5,47,32};
		int temp=0;
		for(int i=a.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
