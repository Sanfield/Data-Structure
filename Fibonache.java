package borderview;
//ì³²¨ÄÇÆõ¶îÊıÁĞ
public class Fibonache {
	public static int k=0;
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			System.out.print(fibonacii(i)+" ");
		}
	}
	public static long fibonacii(long m){
		if(m==0||m==1){
			k++;
			return m;
		}else{
			return fibonacii(m-1)+fibonacii(m-2);
		}
	}
}
