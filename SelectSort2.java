package sort;

public class SelectSort2 {

	public static void main(String[] args) {
		int[] a= {84,6,1,84,95,23,48,78};
		int temp;
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
