package HUAWEI;

import java.util.Scanner;

public class Demo28 {
	//��ȡ��������
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String str=sc.next();
			System.out.println(process(str));
		}
		sc.close();
		
	}
	public static int process(String str){
		int len=str.length();
		if(len<1){
			return 0;
		}
		int max=1;
		//���������Ļ�����
		for(int i=0;i<len-1;i++){
			int k=i-1,j=i+1;
			int count=0;
			while(k>=0 && j<len-1){
				if(str.charAt(k--)==str.charAt(j++)){
					count++;
				}else{
					break;
				}
			}
			max= (max>=(count*2+1)?max:(max*2+1));
			
		}
		//ż��������
		for(int i=0;i<len-1;i++){
			int k=i-1,j=i;
			int count=0;
			while(k>=0&&j<=len-1){
				if(str.charAt(k--)==str.charAt(j++)){
					count++;
				}else{
					break;
				}
			}
			max=(max>=count*2)?max:(count*2);
		}
		return max;
	}

}
