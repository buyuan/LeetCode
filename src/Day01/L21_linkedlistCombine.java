package Day01;

public class L21_linkedlistCombine {

	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
//		l1.next=new ListNode(2);
//		l1.next.next=new ListNode(4);
		ListNode l2=new ListNode(1);
//		l2.next=new ListNode(3);
//		l2.next.next=new ListNode(4);
		mergeTwoLists_2(l1, l2);
		
		

	}
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
        	return l2;}
       
        if(l2==null){
        	return l1;}
        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
	 public static ListNode mergeTwoLists_2(ListNode l1, ListNode l2) {
		 if(l1==null){
			 return l2;
		 }
		 if(l2==null){
			 return l1;
		 }
		 ListNode merged=null;
		 ListNode currt=null;		 
		 //获取头结点
		 if(l1!=null&&l2!=null){
			 if(l1.val<l2.val){
				 merged=l1;
				 l1=l1.next;
			 }else{
				 merged=l2;
				 l2=l2.next;
			 }
		 }
		 currt=merged;
		 while(l1!=null&&l2!=null){
			 if(l1.val<l2.val){
				 currt.next=l1;
				 l1=l1.next;
			 }else{
				 currt.next=l2;
				 l2=l2.next;
			 }
			 currt=currt.next;
		 }
		 
		 if(l1!=null){
			 currt.next=l1;
		 }
		 if(l2!=null){
			 currt.next=l2;
		 }
		 return merged;
	 }
}
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
	}

}
