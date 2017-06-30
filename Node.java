package tree;

public class Node {
	public int iData;
	public double dData;
	public Node leftChild;
	public Node rightChild;
	public void displayNode(){
		System.out.print("{");
		System.out.println(iData);
		System.out.println(",");
		System.out.println(dData);
		System.out.println(".");
		System.out.print("}");
	}

}
