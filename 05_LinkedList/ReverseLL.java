public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
		 LinkedListNode<Integer> prev = null;  
        LinkedListNode<Integer> current = head;
    
        
        while(current != null) { 
            LinkedListNode<Integer> next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
       return prev; 
    }
