package sort;

public class ShellSort {
	public static void main(String[] args) {
		int[] a={4,8,3,2,10,15,84,1,6,47,13,81,82};
		int[] array=shellSort(a);
		for(int j=0;j<array.length;j++){
			System.out.print(array[j]+" ");
		}
	}
	
	public static int[] shellSort(int[] a){
		int[] array=a;
		int temp;
		int DataLength;//分割间隔长度 n/2,n/4...
		int pointer;
		DataLength=array.length/2;
		while(DataLength!=0){
			for(int i=DataLength;i<array.length;i++){
				temp=array[i];
				pointer=i-DataLength;
				
				while(temp<array[pointer]&&pointer>=0&&pointer<=array.length){
					array[pointer+DataLength]=a[pointer];
					pointer=pointer-DataLength;
					if(pointer<0||pointer>array.length){
						break;
					}
				}
				a[pointer+DataLength]=temp;
			}
			DataLength=DataLength/2;
		}
		return array;
	}
}
