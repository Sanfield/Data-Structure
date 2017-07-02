package DataItem;

public class HashTable {
	private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;
	public HashTable(int size){
		arraySize = size;
		hashArray= new DataItem[arraySize];
		nonItem=new DataItem(-1);
	}
	public void displayTable(){
		System.out.print("Table:");
		for(int j=0;j<arraySize;j++){
			if(hashArray[j]!=null)
				System.out.print(hashArray[j].getKey()+" ");
			else System.out.print("***");
		}
		System.out.println();
	}
	public int hashFunc(int key){//哈希函数
		return key%arraySize;
	}
	public void insert(DataItem item){
		int key=item.getKey();
		int hashval=hashFunc(key);
		while(hashArray[hashval]!=null && hashArray[hashval].getKey()!= -1){
			//位置被占用
			hashval ++;
			hashval=hashval%arraySize;
		}
		hashArray[hashval]=item;
	}
	public DataItem delete(int key){
		int hashval=hashFunc(key);
		while(hashArray[hashval]!=null){
			if(hashArray[hashval].getKey()==key){
				DataItem temp= hashArray[hashval];
				hashArray[hashval]=nonItem;
				return temp;
			}
			hashval++;
			hashval=hashval%arraySize;
		}
		return null;//没有找到
	}
	public DataItem find(int key){
		int hashval=hashFunc(key);
		while(hashArray[hashval]!=null){
			if(hashArray[hashval].getKey()==key){
				return hashArray[hashval];
			}
			hashval++;
			hashval=hashval%arraySize;
		}
		return null;
	}
	

}
