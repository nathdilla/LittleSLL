public class LittleSLL {
  //variables
  private Node head;

  //constructor
  public LittleSLL()
  {
    head = null;
  }
  //populate list
  public void addNodeToStart(int addData)
  {
    head = new Node(addData, head);
  }

  public boolean hasNext()
  {
    Node position = head;
    if (position.getLink() != null)
    {
      return true;
    }
    else
    {
      return false;
    }
  }//end method hasNext

  public int length()
  {
    int count = 0;
    Node position = head;
    while(position != null)
    {
      count++;
      position = position.getLink();
    }
    return count;
  }

  public void deleteNodeFromStart()
  {
    if (head != null)
    {
      head = head.getLink();
    }
    else
    {
      System.out.println("Cannot delete from an empty list");
      System.exit(0);
    }
  }

  //display list
  public void showList()
  {
    Node position = head;
    while(position != null)
    {
      System.out.println(position.getData());
      position = position.getLink();
    }
  }

  private class Node
  {
    //instance variables
    private int data;
    private Node link; // instance of self referencing class

    //constructors
    public Node(int data, Node link)
    {
      this.data = data;
      this.link = link;
    }
    //getters setters
    public int getData()
    {
      return data;
    }
    public Node getLink()
    {
      return link;
    }
    //toString
    public String toString()
    {
      return "DATA: " + data + " LINKS TO " + link;
    }
  }//end inner class Node
}