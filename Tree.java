package tree;

public class Tree {
	private Node root;
	public Tree(){
		root=null;
	}
	//����һ���ڵ�
	public void insert(int id,double dd){
		Node newNode= new Node();
		newNode.iData=id;
		newNode.dData= dd;
		if(root==null)
			root= newNode;
		else{
			Node current =root;
			Node parent;
			while(true){
				parent =current; 
				if(id<current.iData){
					current=current.leftChild;
					if(current==null){
						parent.leftChild=newNode;
						return;
					}
				}else{
					current=current.rightChild;
					if(current==null){
						parent.leftChild=newNode;
						return;
					}
					
				}
			}
			
		}
			
	}
	public boolean delete(int key){
		Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		while(current.iData!=key){
			parent=current;
			if(key<current.iData){
				isLeftChild=true;
				current=current.leftChild;
			}else{
				isLeftChild=false;
				current=current.rightChild;
			}
			if(current==null){
				return false;//û�Ҵ�
			}
			if(current.leftChild==null && current.rightChild==null)
			{
				if(current==root) root=null;//ɾ���ĸ�������û���ӽڵ�
				else if(isLeftChild==true){//ɾ����Ҷ�ӽڵ��Ǹ��ڵ�����ӽڵ�
					parent.leftChild=null;
					
				}else{
					parent.rightChild=null;
				}
			}else if(current.rightChild==null){//Ҫɾ���Ľڵ�ֻ��һ�����ӽڵ�
				if(current==root)
				root=current.leftChild;
				else if(isLeftChild)
					parent.leftChild=current.leftChild;
				else
					parent.rightChild=current.leftChild;
			}else if(current.leftChild==null)//ɾ���Ľڵ�ֻ��һ�����ӽڵ�
			{
				if(current==root)
					root=current.rightChild;
				else if(isLeftChild)
					parent.leftChild=current.rightChild;
				else 
					parent.rightChild=current.rightChild;
			}else{//Ҫɾ�Ľڵ����Ҷ��нڵ�(�ұ�����)
				Node success=getSuccessor(current);
				
			}
		}
	}
	private Node getSuccessor(Node deleNode){
		Node successorParent =deleNode;
		Node successor=deleNode;
		Node current=deleNode.rightChild;
		while(current!=null){
			successorParent=successor;
			successor=current;
			current=current.leftChild;
		}
		if(successor!=deleNode.rightChild){
			successorParent.leftChild= 
		}
	}
}
