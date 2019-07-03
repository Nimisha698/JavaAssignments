package genericsarrayscontainers;

public class SListIterator<T> {
    public void insert(SList sList,Node<T> head,T data)
    {
        Node nodeToInsert=new Node(data);
        if(sList.head==null)
        {
            sList.head=nodeToInsert;
        }
        else
        {
            Node temp;
            for(temp=head;temp.next!=null;temp=temp.next);
            temp.next=nodeToInsert;
        }
    }
    public void delete(SList slist,Node<T> head,T data)
    {
        if(slist.head.getData()==data)
        {
            Node toDelete=head;
            slist.head=slist.head.next;
            toDelete=null;
        }
        else
        {
            Node temp;
            for(temp=head;temp.next!=null && temp.next.getData()!=data;temp=temp.next);
            if(temp.next==null)
            {
                System.out.println("Element not found");
            }
            else
            {
                Node toDelete=temp.next;
                temp.next=temp.next.next;
                toDelete=null;
            }
        }
    }
}
