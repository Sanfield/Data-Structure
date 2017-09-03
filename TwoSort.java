package sort;

public class TwoSort {
	public static void main(String[] args) {
		int low=0,high=0,mid=0;
		int temp;
		int[] a={45,56,1,5,8,3,148,13};
		for(int i=1;i<a.length;i++){//二分法插入
			temp=a[i];
			low=0;
			high=i-1;
			while(low<=high){
				mid=(low+high)/2;
				if(a[mid]>temp)
					high=mid-1;
				else
					low=mid+1;
				
			}
			for(int j=i-1;j>high;j--){
				a[j+1]=a[j];
				
			}
			a[high+1]=temp;
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}
