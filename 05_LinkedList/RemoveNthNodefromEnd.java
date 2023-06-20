public static Node removeKthNode(Node head, int n)
    {
        if(head.next == null){
            return null;
        }
        int size = count(head);
        int prev = size-n;
       Node temp = head;
        if(n==size){
            return head.next;
        }
        int i=1;
        while(i<prev){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
        
    }
     public static int count(Node head){
        if(head==null){
            return 0;
        }
        Node temp = head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
