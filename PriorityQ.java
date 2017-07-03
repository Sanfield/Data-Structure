package datagroup;

import javax.management.QueryEval;

public class PriorityQ {
	private long[] queQrray;
	private int maxSize;
	private int nItem;
	public PriorityQ(int size){
		maxSize= size; //开辟的空间 
		queQrray = new long[maxSize];
		nItem=0; //元素个数
	}
	public void insert(long item){
		int j;//插入的位置
		if(nItem==0){
			queQrray[nItem++]=item;
		}else{
			for(j=nItem-1;j>=0;j--){ //从上往下依次找
				if(item>queQrray[j])//如过比原来的数大 就继续往下
					queQrray[j+1]=queQrray[j];
				else
					break;
			}
			nItem++;
			queQrray[j+1]=item;
		}
	}
	public long remove(){
		return queQrray[--nItem];
	}
	public long peekMin(){
		return queQrray[nItem-1];
	}
	public boolean isEmpty(){
		return nItem==0;
	}
	public boolean isFull(){
		return nItem==maxSize; 
	}
	public int getSize(){
		return nItem;
	}
}
