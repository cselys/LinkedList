/**
 * Created with IntelliJ IDEA.
 * User: xps
 * Date: 5/28/13
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReverseList {
    public static void main(String[] args){
        List myList=new List(1);
        myList.next=new List(2);
        myList.next.next=new List(3);
        System.out.println(myList.toString());
        List rReversed=Reverse(myList);
        System.out.println(Reverse(myList).toString());
    }

    public static List Reverse(List L){
        if(L==null || L.next==null)
            return L;
        List newL=L;
        List cur=L.next;
        newL.next=null;
        while(cur!=null){
            List tmpL=cur;
            cur=cur.next;
            tmpL.next=newL;
            newL=tmpL;
        }
        return newL;
    }
}
