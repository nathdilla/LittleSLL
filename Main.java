public class Main
{
  public static void main(String[] args)
  {
    LittleSLL mySLL = new LittleSLL();

    mySLL.addNodeToStart(25);
    mySLL.addNodeToStart(38);
    mySLL.addNodeToStart(-42);

    mySLL.showList();
    System.out.println("list length: " + mySLL.length());

    mySLL.deleteNodeFromStart();
    mySLL.showList();
    System.out.println("list length: " + mySLL.length());
  }
}