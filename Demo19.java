package HUAWEI;

import java.util.Scanner;

public class Demo19 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String password= sc.nextLine();
			if(checkLen(password)&&checkCharKinds(password)){
				System.out.println("OK");
			}else{
				System.out.println("NG");
			}
		}
	}
	//�жϳ���
	public static boolean checkLen(String password){
		if(password.equals(null)||password.length()<=8){
			return false;
		}
		return true;
	}
	//�ж��Ƿ������Сд���֣���������
	//�����ַ�����ÿһ��Ԫ�أ��Դ��ж�
	public static boolean checkCharKinds(String password){
		int upper=0,low=0,digit=0,other=0;
		char[] ch=password.toCharArray();
		for(int i=0;i<password.length();i++){
			if(Character.isUpperCase(ch[i])){
				upper=1;
				continue;
			}else if(Character.isLowerCase(ch[i])){
				low=1;
				continue;
			}else if(Character.isDigit(ch[i])){
				digit=1;
				continue;
			}else{
				other=1;
				continue;
			}
		}
		if((upper+low+digit+other)>=3)
			return true;
		return false;
	}
	//��������ͬ���ȳ���2���ַ���
	public static boolean checkCharRepeat(String password){
		for(int i=0;i<password.length()-2;i++){
			String str=password.substring(i, i+3);
			for(int j=i+1;j<password.length()-2;j++){
				if(password.substring(j).contains(str))
					return false;
			}
		}
		return true;
	}

}
