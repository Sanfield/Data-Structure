package sort;

public class SelectSort {
	public static void main(String[] args) {
		int a[]={8,7,9,51,56,8,6,351,84,8,2,1};
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
