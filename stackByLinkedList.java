import  java.util.*;
class stack{
 Scanner s=new Scanner(System.in);
  int data;
  stack next;
  stack top;
  //this is a constructor of stack class
  stack(){
    top=null;//here top initialised by null because it will reduce line of code.
  }
  //this is push method
  void Push ()
  {
    stack node=new stack();
    System.out.println("Enter element");
    node.data=s.nextInt();
    node.next=top;
    top=node;
  }
  //this is pop method
  void Pop()
  {
      if(top==null){
        System.out.println("stack is already empty");
      }
      else{
        top=top.next;
      }

  }
  //this is display method
  void display()
  {
        if(top==null){
          System.out.println("Stack is empty");
        }
        else{
          stack temp=top;
          while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
          }
        }
  }
}
class stackByLinkedList{
  public static void main(String[] args) {
    stack ob=new stack();
    for(;;){
      System.out.println(" ");
      System.out.println("Which operation do you want: ");
      System.out.println("Enter 1 for Push operation");
      System.out.println("Enter 2 for Pop operation");
      System.out.println("Enter 3 for Display operation");
      System.out.println("Enter 4 for Exit operation");
      System.out.println(" ");
      Scanner s=new Scanner(System.in);
      switch(s.nextInt()){
        case 1: ob.Push ();
              break;
        case 2: ob.Pop();
              break;
        case 3: ob.display();
              break;
        case 4: System.exit(0);
        default: System.out.println("Wrong choice ");
      }
    }
  }
}
