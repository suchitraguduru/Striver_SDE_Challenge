public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> list1, LinkedListNode<Integer> list2) {
		if(list1==null && list2==null){
            return null;
        }
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        
        LinkedListNode head = new LinkedListNode(0);
        LinkedListNode list3=head;
        while(list1!=null && list2!=null){
            if(list1.data<=list2.data){
                list3.next=list1;
                list1=list1.next;
            }else{
                list3.next = list2;
                list2 = list2.next;
            }
            list3=list3.next;
        }
        if(list1!=null){
            list3.next=list1;
        }
        if(list2!=null){
            list3.next=list2;
        }
        return head.next;
	}
