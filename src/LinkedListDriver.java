public class LinkedListDriver
{
    public static void main(String[] args)
    {
        IntLinkedList list = new IntLinkedList();
        list.addANodeToStart(5);
        list.addANodeToStart(7);
        list.addANodeToStart(8);
        list.addANodeToStart(9);
        list.addANodeToStart(10);

        list.showList();
        System.out.println("List has " + list.length() + " elements.");
        list.deleteANodeFromStart();
        list.showList();
        for (int i = 0; i < 4; i++)
        {
            
        }//end for loop
    }//end main method
}//end driver class
