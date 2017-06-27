package datagroup;

public class Ord {
	private long [] a;
	private int nElems;
	public Ord(int max){
		a= new long[max];
		nElems=0;
	}
	public int size(){
		return nElems; //查看数组大小
	}
	//添加数据
	public void insert(long value){
		int j;
		for(j=0;j<nElems;j++){
			if(a[j]>value) break;
		
		}
		for(int k=nElems;k>j;k--){
			a[k]=a[k-1];
			
		}
		a[j]=value;
		nElems++;
	}
	public boolean delete(long value){
		int j=bfind(value);
		if(j==nElems){
			return false;
		}else{
			for(int k=j;k<nElems;k++){
				a[k]=a[k+1];
			}
			nElems--;
			return true;
		}
		
	}
	public void display(){
		for(int i=0;i<nElems;i++){
			System.out.print(a[i]+" ");
		}
	}
	//二分查找
	public int bfind (long searchKey){
		int lower=0;
		int upper=nElems-1;
		int curIn;
		while(true){
			curIn=(lower+upper)/2;
			if(a[curIn]==searchKey)
				return curIn;
			else if(lower>upper)
				return nElems;//没有找到 返回最大索引
			else{
				if(a[curIn]<searchKey)
					lower =curIn+1;
				else
					upper= curIn-1;
			}
		}
	}
	

}
