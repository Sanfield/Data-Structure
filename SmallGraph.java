package map;

public class SmallGraph {
	private final int MAX_VERTS=20;
	private Vertex vertexList[];
	private int [][] adjMat;//�ڽӾ���
	private int nVerte;//��ǰ������
	private StackX theStack;
	public SmallGraph(){
		vertexList=new Vertex[MAX_VERTS];
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		nVerte=0;
		for(int j=0;j<MAX_VERTS;j++)
			for(int k=0;k<MAX_VERTS;k++)
				adjMat[j][k]=0;
		theStack= new StackX();//����һ��ջ
	}
	public void addVertex(char lab){
		vertexList[nVerte++]=new Vertex(lab);
		
	}
	public void addEdg(int start,int end){//������
		adjMat[start][end]=adjMat[end][start]=1;
	}
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
		
	}
	public void mst(){//��С������
		
		vertexList[0].wasVisited=true;
		theStack.push(0);
		while(!theStack.isEmpty()){
			int currentVertex=theStack.peek();
			int v= getAdjUnvisitedVertex(currentVertex);
			if(v==-1)
				theStack.pop();//û�ҵ�ֱ�ӵ���
			else{
				vertexList[v].wasVisited=true;
				theStack.push(v);
				displayVertex(currentVertex);
				displayVertex(v);//��ӡһ����
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
