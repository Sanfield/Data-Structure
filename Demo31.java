package HUAWEI;

import java.util.Scanner;

public class Demo31 {
	//���ξ���
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			int N= sc.nextInt();
			int[][] mat= new int[N][N];
			mat[0][0]=1;
			System.out.print(mat[0][0]);
			//��ʼ����һ��
			for(int i=1;i<N;i++){
				mat[0][i]=mat[0][i-1]+i+1;
				System.out.print(" "+mat[0][i]);
			}
			for(int j=1;j<N;j++){
				System.out.println();
				for(int k=0;k<N-j;k++){
					mat[j][k]=mat[j-1][k+1]-1;
					if(k==0){
						System.out.print(mat[j][k]);
					}else{
						System.out.print(" "+mat[j][k]);
					}
				}
			}
		}
		sc.close();
	}

}
