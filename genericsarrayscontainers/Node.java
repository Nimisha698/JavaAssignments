package genericsarrayscontainers;

public class Node<T>
{
    T data;
    Node next;
    public Node(T data)
    {
        this.data=data;
        next=null;
    }

    public T getData()
    {
        return data;
    }
}
