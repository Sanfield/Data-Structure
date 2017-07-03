package datagroup;

import javax.management.QueryEval;

public class PriorityQ {
	private long[] queQrray;
	private int maxSize;
	private int nItem;
	public PriorityQ(int size){
		maxSize= size; //���ٵĿռ� 
		queQrray = new long[maxSize];
		nItem=0; //Ԫ�ظ���
	}
	public void insert(long item){
		int j;//�����λ��
		if(nItem==0){
			queQrray[nItem++]=item;
		}else{
			for(j=nItem-1;j>=0;j--){ //��������������
				if(item>queQrray[j])//�����ԭ�������� �ͼ�������
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
