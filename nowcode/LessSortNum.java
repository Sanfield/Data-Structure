/**
 * @Author: sangfei
 * @Date: 2019/1/14 18:15
 * @Description:
 */
public class LessSortNum {
    public static void main(String[] main){

    }

    public int findShorttest(int[] A,int n ){
//        int result=0;
        if(n==0||A==null){
            return 0;
        }
        int min=A[n-1];
        int noMinIndex= -1;
        for(int i=n-2;i>-1;i--){
            if(A[i]>min){
                noMinIndex=i;
            }else{
                min= Math.min(min,A[i]);
            }
        }
        if(noMinIndex== -1){
            return 0;
        }
        int max=A[0];
        int noMaxIndex=-1;
        for(int i=1;i<n;i++){
            if(A[i]<max){
                noMaxIndex=i;
            }else{
                max=Math.max(max,A[i]);
            }
        }
        return noMaxIndex - noMinIndex  + 1;
    }
}
