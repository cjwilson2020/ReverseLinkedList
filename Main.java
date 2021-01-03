class Main {
  public static void main(String[] args) {
    int[] arr = {1,10,16,88};
    LinkedList list = makeList(arr);
    System.out.println(list.toString());

  }

  public static LinkedList makeList(int[] a){
    LinkedList ll = new LinkedList();

    for (int i = 0; i < a.length; i++){ 
      System.out.println("Adding " + a[i]);
      ll.add(a[i]);
    //  System.out.println(ll.toString());
    }
    return ll;
  }
}

class LinkedList{
  public Node head;
  public Node tail;
  private int size;
  public LinkedList(){
    this.head = null;
    size = 0;
    this.tail= null;
  }

  public void add(int n){
    Integer tmp = (Integer)n;
    Node newNode = new Node();
    newNode.setValue(tmp); // creates node

    //checks if a tail exists, if so, set the tail's next
    // to the new node and set tail to new node
    if (tail != null){
      tail.setNext(newNode);
      tail = tail.getNext();
    }else if (head == null){
      head = newNode;
      tail = head;
    } 
    // else{
    //   System.out.println("head.getNext() for " + head +": " + head.getNext());
    //   if (head.getNext() == null){
    //     head.setNext(newNode);
    //     tail = head.getNext();
    //   }else{
    //     Node current = head;
    //     while(current.getNext() != null){
    //       current = current.getNext();
    //     }
    //     current.setNext(newNode);
    //     tail = current;
    //   }
    // }
    this.size++;
  }

  public String toString(){
    if (head == null){
      return "null";
    }
    String s = head.getValue() + " --> " ;
    Node current = head;
    while(current.getNext() != null){
      current = current.getNext();
      s = s + current.getValue().toString() + " --> ";
    }
    return s;
  }
  
}

class Node{
  private Integer value;
  private Node next;
  public Node(Integer val){
    this.value = val;
    this.next = null;
  }

  public Node (){
    this.value = null;
    this.next = null;
  }

  public Integer getValue(){
    return value;
  }
  public void setValue(Integer val){
    value = val;
  }
    
  public Node getNext(){
    return next;
  }
  public void setNext(Node node){
    next = node;
  }
}
