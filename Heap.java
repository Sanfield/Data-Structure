package heap;

public class Heap {
	private Node[] heapArray;
	private int maxSize;
	private int currentSize;
	public Heap(int mx){
		maxSize=mx;
		currentSize=0;
		heapArray=new Node[maxSize];
	}
	public boolean isEmpty(){
		return currentSize==0;
	}
	public boolean insert(int key){
		if(currentSize==maxSize)
			return false;
		else{
			Node newNode= new Node(key);
			heapArray[currentSize]=newNode;//�½ڵ�ŵ����
			trickleUp(currentSize);//���ϵ���
			currentSize++;
			return true;
			
		}
	}
	//���ϵ���
	public void trickleUp(int index){
		int parent=(index-1)/2;//���ڵ�����������ӽڵ�����-1/2
		Node bottom=heapArray[index];
		while(index>0 && heapArray[parent].getKey()<bottom.getKey()){
			heapArray[index]=heapArray[parent];
			index=parent;
			parent=(parent-1)/2;
		}
		heapArray[index]=bottom;
	}
	public Node remve(){
		//ɾ�����������
		Node root = heapArray[0];
		heapArray[0]=heapArray[--currentSize];//�����һ���������Ƶ���һ��
		trickleDown(0);//���µĸ����µ���
		return root;
	}
	//���µ���
	public void trickleDown(int index){
		int largeChild;
		Node top=heapArray[index];
		while(index<currentSize/2){//δ�ҵ����һ��
			int leftChild=2*index+1;
			int rightChild=leftChild+1;
			if(rightChild<currentSize && heapArray[leftChild].getKey()<heapArray[rightChild].getKey())
				largeChild=rightChild;
			else
					largeChild=leftChild;
			if(top.getKey() >= heapArray[largeChild].getKey())
				break;//���õ���
			heapArray[index]=heapArray[largeChild];
			index=largeChild;
			
		}
		heapArray[index]=top;
	}
	//�ı����ȼ�
	public boolean change(int index,int newValue){
		if(index<0 ||index>=currentSize){
			return false;//��Чλ��
		}
		int oldValue= heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		if(oldValue<newValue){
			trickleUp(index);
			
		}else{
			trickleDown(index);
		}
		return true;
	}
	public void displayHeap(){
		System.out.print("HeapArray:");
		for(int i=0;i<currentSize;i++){
			if(heapArray[i]!=null)
				System.out.print(heapArray[i].getKey()+" ");
			else
				System.out.print("--");
		}
		System.out.println();
		
		//����״��ʽ��ʾ
		int nBlanks=32;
		int iteamPerRow=1;
		int column=0;
		int j=0;
		String dots="........";
		System.out.println(dots+dots);
		while(currentSize>0){
			if(column==0){
				for(int k=0;k<nBlanks;k++)
					System.out.print(' ');
			}
			System.out.print(heapArray[j].getKey());
			if(++j==currentSize) break;//ȫ����ӡ�� 
			if(++column==iteamPerRow){
				nBlanks/=2;
				iteamPerRow*=2;
				column=0;
				System.out.println();
			}else
				for(int k=0;k<nBlanks*2-2;k++)
					System.out.println(" ");
		}
		System.out.println(dots+dots);
	}
}
