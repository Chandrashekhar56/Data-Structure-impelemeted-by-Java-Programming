import  java.util.*;
class queue{
  Scanner s=new Scanner(System.in);
  int maxsize=5,element;//we can change maxsize according to needs
  int []queueArr=new int[maxsize];
  int front=-1,rear=-1;// here i have declared initial value of front and rear
  int delete,i,j,temp;

  //This is enqueue opearation
  void enqueue()
  {
    System.out.println("Enter Element ");
    element=s.nextInt();
    if(front==-1 && rear==-1)
    {
      front=front+1;
      rear=rear+1;
      queueArr[rear]=element;
    }
    else if(rear==maxsize-1)
    {
      System.out.println("Queue is already full so Insertion not possible");
    }
    else
    {
      rear=rear+1; queueArr[rear]=element;
      for(i=front;i<=rear;i++)
      {
        for(j=i;j<=rear;j++)
        {
          if(queueArr[i]<=queueArr[j])//this is descending order priority queue.
          {
            temp=queueArr[i];
            queueArr[i]=queueArr[j];
            queueArr[j]=temp;
          }
        }
      }
    }
  }

  //This is dequeue operation
  void dequeue()
  {
    if(front==-1 && rear==-1)
    {
      System.out.println("Queue is already empty");
    }
    else if(front==rear)
    {
      delete=queueArr[front];
      front=rear=-1;
    }
    else
    {
      delete=queueArr[front];front=front+1;
    }
  }

  //This is display operation
  void display()
  {
    if(front==-1 && rear==-1)
    {
      System.out.println("Queue is empty");
    }
    else
    {
       System.out.println("Existing elements in Queue: ");
       int i;
       for(i=front;i<=rear;i++)
       {
         System.out.println(queueArr[i]);
       }
     }
   }
}
class PriorityQueueByArray{
  public static void main(String[] args) {
    queue ob=new queue();
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
