package genericsarrayscontainers;

public class SList<T>
{

    Node head=null;
    public String toString()
    {
        String result="";
        Node temp;
        SList sList=new SList();
        for(temp=head;temp.next!=null;temp=temp.next)
        {
            result+=temp.getData().toString();
            result+=" ";
        }
        result+=temp.getData().toString();
        return result;
    }
    public SListIterator<T> iterator()
    {
        return new SListIterator();
    }
}
