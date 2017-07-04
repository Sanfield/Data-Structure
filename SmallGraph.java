package map;

public class SmallGraph {
	private final int MAX_VERTS=20;
	private Vertex vertexList[];
	private int [][] adjMat;//邻接矩阵
	private int nVerte;//当前顶点数
	private StackX theStack;
	public SmallGraph(){
		vertexList=new Vertex[MAX_VERTS];
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		nVerte=0;
		for(int j=0;j<MAX_VERTS;j++)
			for(int k=0;k<MAX_VERTS;k++)
				adjMat[j][k]=0;
		theStack= new StackX();//创建一个栈
	}
	public void addVertex(char lab){
		vertexList[nVerte++]=new Vertex(lab);
		
	}
	public void addEdg(int start,int end){//创建边
		adjMat[start][end]=adjMat[end][start]=1;
	}
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
		
	}
	public void mst(){//最小生成树
		
		vertexList[0].wasVisited=true;
		theStack.push(0);
		while(!theStack.isEmpty()){
			int currentVertex=theStack.peek();
			int v= getAdjUnvisitedVertex(currentVertex);
			if(v==-1)
				theStack.pop();//没找到直接弹出
			else{
				vertexList[v].wasVisited=true;
				theStack.push(v);
				displayVertex(currentVertex);
				displayVertex(v);//打印一个边
				System.out.print(" ");
			}
			
		}
		for(int j=0;j<nVerte;j++)
			vertexList[j].wasVisited=false;
	
	}
	public int getAdjUnvisitedVertex(int v){
		for(int j=0;j<nVerte;j++)
			if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
				return j;
		return -1;
	}
}
