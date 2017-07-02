package DataItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashTableApp {
	public static void main(String agrs[])throws IOException{
		DataItem aDataItem;
		int akey,size,n,keyPerCell;
		System.out.print("Enter size of hash table");
		size=getInt();
		System.out.print("Enter initial number of items:");
		n=getInt();
		keyPerCell=10;
		HashTable thetable= new HashTable(size);
		for(int j=0;j<n;j++){
			akey=(int)(java.lang.Math.random()*keyPerCell*size);
			aDataItem = new DataItem(akey);
			thetable.insert(aDataItem);
		}
		while(true){
			System.out.print("Enter first leterr of show,insert,delete,of find:");
			char choice=getChar();
			switch(choice){
			case's':
				thetable.displayTable();
				break;
			case'i':
				System.out.println("Enter key value to inser:");
				akey=getInt();
				aDataItem= new DataItem(akey);
				break;
			case'd':
				System.out.println("Enter key value to find");
				akey=getInt();
				thetable.delete(akey);
				break;
			case'f':
				System.out.println("Enter key to find:");
				akey=getInt();
				aDataItem= thetable.find(akey);
				if(aDataItem!=null){
					System.out.println("Found"+akey);
				}else{
					System.out.println("Counld nt find"+akey);
				}
				break;
				default:
					System.out.print("Invalid entry\n");
			}
		}
	}
	public static String getString() throws IOException{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		return br.readLine();
	}
	public static char getChar() throws IOException{
		return getString().charAt(0);
	}
	public static int getInt() throws NumberFormatException, IOException{
		return Integer.parseInt(getString());
	}
}
