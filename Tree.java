package tree;

public class Tree {
	private Node root;
	public Tree(){
		root=null;
	}
	//插入一个节点
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
				return false;//没找打
			}
			if(current.leftChild==null && current.rightChild==null)
			{
				if(current==root) root=null;//删除的根，并且没有子节点
				else if(isLeftChild==true){//删除的叶子节点是父节点的左子节点
					parent.leftChild=null;
					
				}else{
					parent.rightChild=null;
				}
			}else if(current.rightChild==null){//要删除的节点只有一个左子节点
				if(current==root)
				root=current.leftChild;
				else if(isLeftChild)
					parent.leftChild=current.leftChild;
				else
					parent.rightChild=current.leftChild;
			}else if(current.leftChild==null)//删除的节点只有一个右子节点
			{
				if(current==root)
					root=current.rightChild;
				else if(isLeftChild)
					parent.leftChild=current.rightChild;
				else 
					parent.rightChild=current.rightChild;
			}else{//要删的节点左右都有节点(右边最左)
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
