public class IntLinkedList
{
    //variables
    private Node head;

    //constructors
    public IntLinkedList()
    {
        head = null;
    }//end head constructor

    public void addANodeToStart(int addData)
    {
        head = new Node(addData, head);
    }

    //delete
    public void deleteANodeFromStart()
    {
        if (head != null)
        {
            head = head.getLink();
        }//end if head not null
        else
        {
            System.out.println("Deleting from an empty list");
            System.exit(0);
        }//end else
    }//end delete Node

    //length
    public int length()
    {
        int count = 0;
        Node position = head;
        while (position  != null)
        {
            count++;
            position = position.getLink();

        }//end while

        return count;
    }//end length method

    //hasNext
    public boolean hasNext()
    {
        Node position = head;
        if(position.getLink() != null)
        {
            return true;
        }
        return false;
    }//end method hasNext


    //setData

    public void showList()
    {
        Node position =  head;
        while (position != null)
        {
            System.out.println(position.getData());
            position = position.getLink();
        }
    }
}
