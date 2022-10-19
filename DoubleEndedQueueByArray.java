import java.util.*;
class queue{
        Scanner s=new Scanner(System.in);
        int size=5;
        int []queueArr=new int[size];
        int front=-1,rear=-1,element,delete;

        //This is enqueue operation for double ended queue
        void enqueue()
        {
          System.out.println("Enter element");
          element=s.nextInt();
          //Here you can see Enqueue operation from rear end and front end
          System.out.println("Enter 1 for Enqueue operation from rear ");
          System.out.println("Enter 2 for Enqueue operation from front ");
          switch(s.nextInt())
          {
            case 1: if(front==-1 && rear==-1)// this condition used for when front and rear initial value is -1
                    {
                      front=front+1;
                      rear=rear+1;
                      queueArr[rear]=element;
                    }
                    else if((front==0 && rear==size-1)||(rear==front-1))//this condition used for check if queue is already full
                    {
                        System.out.println("Queue is already full");
                    }
                    else if(rear==size-1)// this condition used for if enqueue start from front end, that time we have to change the value of rear for operations.
                    {
                      rear=0;
                      queueArr[rear]=element;
                    }
                    else
                    {
                      rear=rear+1;
                      queueArr[rear]=element;
                    }
                    break;

            case 2:
                    if(front==-1 && rear==-1)// this condition used for when front and rear initial value is -1
                    {
                      front=size-1;
                      rear=size-1;
                      queueArr[front]=element;
                    }
                    else if((front==0 && rear==size-1)||(rear==front-1))//this condition used for check if queue is already full
                    {
                        System.out.println("Queue is already full");
                    }
                    else if(front==0)// this condition use for if enqueue start from rear end, that time we have to change the value of front for operations.
                    {
                      front=size-1;
                      queueArr[front]=element;
                    }
                    else
                    {
                      front=front-1;
                      queueArr[front]=element;
                    }
                    break;
            default: System.out.println("Wrong choice");
          }
        }
        //This is dequeue operation for double ended queue
        void dequeue()
        {
          //Here you can see denqueue operation from rear end and front end
          System.out.println("Enter 1 for Dequeue operation from rear ");
          System.out.println("Enter 2 for Dequeue operation from front ");
          switch(s.nextInt())
          {
            case 1: if(front==-1 && rear==-1)// this condition used for if queue is already empty
                    {
                      System.out.println("Queue is already empty");
                    }
                    else if(rear==front)//this condition used for if rear and front both are at same index.
                    {
                      element=queueArr[rear];
                      rear=-1;
                      front=-1;
                      System.out.println("Element deleted from rear end");
                    }
                    else if(rear==-1)// this condition used  for after dequeue operation from rear end, we can get rear initial value. It means all rear end elements are removed but we have some elements in front end.
                    {
                      System.out.println("No element in rear end so you can dequeue from front end");
                    }
                    else
                    {
                      delete=queueArr[rear];
                      rear=rear-1;
                      System.out.println("Element deleted from rear end");
                    }
                    break;

            case 2: if(front==-1 && rear==-1)// this condition used for if queue is already empty
                    {
                      System.out.println("Queue is already empty");
                    }
                    else if(rear==front)//this condition used for if rear and front both are at same index.
                    {
                      element=queueArr[front];
                      rear=-1;
                      front=-1;
                      System.out.println("Element deleted from front end");
                    }
                    else if(front==size-1)// this condition used for if front at last index of  queue.
                    {
                          delete=queueArr[front];
                          front=-1;
                          System.out.println("Element deleted from front end");
                    }
                    else if(front==-1)// this condition used  for after dequeue operation from front end, we can get front initial value. It means all front end elements are removed but we have some elements in rear end.
                    {
                      System.out.println("No element in front end so you can dequeue from rear end");
                    }
                    else
                    {
                      delete=queueArr[front];
                      front=front+1;
                      System.out.println("Element deleted from front end");
                    }
                    break;
            default: System.out.println("Wrong choice");
          }
        }
        void display()
        {
              if(front==-1 && rear==-1)//this condition used for if queue is empty
              {
                System.out.println("Queue is empty");
              }
              else
              {
                System.out.println("Existing elements in Queue");
                if(rear>=front)//if rear is greater than or equal front
                {
                  for(int i=front;i<=rear;i++)
                  {
                    System.out.println(queueArr[i]);
                  }
                }
                else
                {
                  for(int i=0;i<=rear;i++)
                  {
                    System.out.println(queueArr[i]);
                  }
                  for(int i=front;i<=size-1;i++)
                  {
                    System.out.println(queueArr[i]);
                  }
                }
              }
        }
}
class DoubleEndedQueueByArray{
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
