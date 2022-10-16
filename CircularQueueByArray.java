import java.util.*;
class CircularQueue {
  Scanner s=new Scanner(System.in);
  int maxsize=5,front=-1,rear=-1,element,delete;//we can change maxsize according to needs // here i have declared initial value of front and rear
  int []CirQueue=new int[maxsize];
 //This is enqueue opearation
  void enqueue(){
    System.out.println("Enter element");
    element=s.nextInt();
    if((front==0 && rear==maxsize-1)||(rear==front-1)/*or we can also use this condition-----(front==rear+1%maxsize)----*/)
    { System.out.println("Queue is already full ");}
    else if(front==-1 && rear==-1)
    { front=front+1;rear=rear+1; CirQueue[rear]=element;}
    else
    { rear=(rear+1)%maxsize; CirQueue[rear]=element;}
  }
//This is dequeue operation
  void dequeue(){
    if(front==-1 && rear==-1)
    { System.out.println("Queue is already empty");}
    else if(front==rear)
    { delete=CirQueue[front]; rear=-1;front=-1; }
    else
    { delete=CirQueue[front]; front=(front+1)%maxsize;}
  }
 //This is display operation
  void display(){
    if(front==-1 && rear==-1 )
    { System.out.println("Queue is empty");}
    else
    { int i;
      System.out.println("Existing Elements in Circular Queue");
      if(rear>=front)
      {
        for(i=front;i<=rear;i++)
        { System.out.println(CirQueue[i]);}
      }
      else
      {
        for(i=0;i<=rear;i++)
        { System.out.println(CirQueue[i]);}
        for(i=front;i<maxsize;i++)
        { System.out.println(CirQueue[i]);}
      }
    }
  }
}
class CircularQueueByArray{
  public static void main(String[] args) {
    CircularQueue ob=new CircularQueue();
    for(;;){
      System.out.println(" ");
      System.out.println("Which operation do you want: ");
      System.out.println("Enter 1 for Enqueue operation");
      System.out.println("Enter 2 for Dequeue operation");
      System.out.println("Enter 3 for Display operation");
      System.out.println("Enter 4 for Exit operation");
      System.out.println(" ");
      Scanner s=new Scanner(System.in);
      switch(s.nextInt()){
        case 1: ob.enqueue();
              break;
        case 2: ob.dequeue();
              break;
        case 3: ob.display();
              break;
        case 4: System.exit(0);
        default: System.out.println("Wrong choice ");
      }
    }
  }
}
