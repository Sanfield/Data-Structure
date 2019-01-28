/**
 * @Author: sangfei
 * @Date: 2019/1/28 15:17
 * @Description:
 */
public class LeetCode2 {
    public static void  main(String[] args){

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode dummyHead=new ListNode(0);
        ListNode curr=dummyHead;
        int res=0;//进位
        while (l1!=null || l2!=null){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=x+y+res;
            res=sum/10;
            curr.next= new ListNode(sum%10);
            curr=curr.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(res>0){
            curr.next=new ListNode(res);
        }

        return dummyHead.next;
    }
}

 class ListNode {
      int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }
