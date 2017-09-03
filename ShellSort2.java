package sort;

public class ShellSort2 {
	public static void main(String[] args) {
		int[] a={4,8,3,2,10,15,84,1,6,47,13,81,82};
		ShellSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void ShellSort(int[] a){
		int length=a.length;
		int temp;
		int DataLength;
		int point;
		DataLength=length/2;
		while(DataLength!=0){
			for(int j=DataLength;j<length;j++){
				temp=a[j];
				point=j-DataLength;  
				
				while(temp<a[point]&&point>=0&&point<=length){
					a[point+DataLength]=a[point];
					point=point-DataLength;
					if(point<0||point>length){
						break;
					}
				}
				a[point+DataLength]=temp;
			}
			DataLength=DataLength/2;
		}
		
	}

}
