public static Node findMiddle(Node head)
    {
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int id =(count/2)+1;
        Node temp2 = head;
        int c=1;
        while(c<id){
            temp2=temp2.next;
            c++;
        }
        return temp2;
    }
