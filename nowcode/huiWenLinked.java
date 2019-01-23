import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * @Author: sangfei
 * @Date: 2019/1/23 17:20
 * @Description:
 */
public class huiWenLinked {

    public boolean chkPalindrome(ListNode A) {

        if(A==null){
            return false;
        }else if(A.next==null){
            return false;
        }
        ListNode slow=A;
        ListNode falst=A;
        while(falst != null && falst.next != null){
            falst=falst.next.next;
            slow=slow.next;
        }
        ListNode cur=slow.next;//中间位置的下一个
        ListNode p1=cur.next;
        while(cur!=null){
            cur.next=slow;
            slow= cur;
            cur=p1;
            p1=p1.next;

        }
        while(A!=slow){
            if((A.val)!=(slow.val)){
                return false;
            }else{
                if(A.next == slow){
                    return true;
                }
                    A=A.next;
                    slow=slow.next;


            }

        }
        return true;
    }
}
