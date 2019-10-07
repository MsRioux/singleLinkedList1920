public class Node
{
    //instance variables
    private int data;
    private Node link;
    //constructor
    public Node(int data, Node link)
    {
        this.data = data;
        this.link = link;
    }//end Node constructor

    //getters & setters

    //toString
    public String toString()
    {
        return "data: " + data + " links to: " + link;
    }//end toString

    public int getData()
    {
        return data;
    }

    public Node getLink()
    {
        return link;
    }
}// end class Node
