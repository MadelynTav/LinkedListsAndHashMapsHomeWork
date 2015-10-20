package nyc.c4q.accesscode;
/**
 * Created by c4q-madelyntavarez on 10/18/15.
 * Homework for Circle Linked List
 */

public class Node
{
    Node next;
    String data;

    public Node(String data)
    {
        this.data = data;
    }
}

class ListCircle
{
    Node head;

    public void addToHead(String data)
    {
        Node newNode= new Node(data);
        Node holdNode=newNode;
        holdNode.next=head;
        newNode=head;

        if(head!=null)
        {

            while(newNode.next != null && newNode.next != head)
            {
                newNode = newNode.next;
            }
            newNode.next=holdNode;
        }

        head=holdNode;

    }

    public void addToTail(String data)
    {
        Node newNode= new Node(data);
        Node current=head;
        if(current.next!=null)
        {
            while(current.next != head)
            {
                current = current.next;
            }
        }
        current.next=newNode;
        newNode.next=head;
    }

    public void insertAfter(String prevData, String newData)
    {
        Node current = head;

        while(current.next != null && ! current.data.equals(prevData))
        {
            current = current.next;
        }
        if(current != null)
        {
            Node newNode = new Node(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void update(String oldData, String newData)
    {
        Node current = head;
        while(current.next != null && ! current.data.equals(oldData))
        {
            current = current.next;
        }

        if(current != null)
        {
            current.data = newData;
        }
    }

    public void delete(String data)
    {
        // look for the node that has the data, and point the previous node's pointer to the node,
        //after so that there is no one pointing to the node with the data
        Node current = head;
        if(head == null)
        {
            return;
        }
        if(head.data.equals(data))
        {
            while(current.next!=head){
                current=current.next;
            }
            head = current.next.next;
            current.next.next=head;
            System.out.println(String.valueOf(head));
        }
        while(current.next != null && ! current.next.data.equals(data))
        {
            current = current.next;
        }
        if(current.next != null)
        {
            current.next = current.next.next;
        }

    }

    public void print()
    {
        Node current = head;

        while(current != null)
        {
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }
}
class MainCircle
{
    public static void main(String[] args)
    {
        ListCircle list = new ListCircle();
        list.addToHead("Test Time");
        list.addToTail("LunchTime");
        list.insertAfter("Test Time","Fun Time");
        list.delete("Test Time");
        list.print();

    }
}
