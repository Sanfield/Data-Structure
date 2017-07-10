package borderview;

public class Prime {
	//100以内的素数
	public static void main(String[] args) {
		int i,j;
		int [] a=new int[101];
		for( j=0;j<101;j++)
			a[j]=1;
		for( i=2;i<101;i++){
			for(j=i+i;j<101;){
				if(j%i==0){
					a[j]=0;
				}
				j=j+i;
			}
		}
		for(i=2;i<101;i++){
			if(a[i]!=0)
				System.out.print(i+" ");
		}
	}

}
