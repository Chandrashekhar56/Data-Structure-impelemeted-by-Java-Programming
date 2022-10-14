import java.io.*;
import java.util.*;
class node{
        Scanner s=new Scanner(System.in);
        int maxsize=5;//you can change size of array according to your needs.
        int []stack=new int[maxsize];
        int top=-1;
        //This is push operation
        public void push(){ System.out.println("Enter element ");
        int element=s.nextInt(); if(top==maxsize-1){
        System.out.println("Insertion not possible BCZ top at Array maxsize ");} else{ top=top+1; stack[top]=element;}}
        //this is pop operation
        public void pop(){ if(top==-1){ System.out.println("Stack is already empty ");} else{ top=top-1; System.out.println("Element popped from stack ");}}
        //this is peek operation
        public void peek(){
        if (top==-1) { System.out.println("Stack is empty ");} else{
        System.out.println("Top element in Stack "+stack[top]);}}
        //this is display operation
        public void display(){
        if (top==-1) { System.out.println("Stack is empty ");} else{
        System.out.println("Existing element in Stack");
        for(int i=top;i>=0;i--){ System.out.println(stack[i]);
      }
    }
  }
}
class stackByArray{
  public static void main(String[] args){
      node ob=new node();
      for(;;){
        System.out.println(" ");
        System.out.println("Which operation do you want: ");
        System.out.println("Enter 1 for Push operation");
        System.out.println("Enter 2 for Pop operation");
        System.out.println("Enter 3 for Peek operation");
        System.out.println("Enter 4 for Display operation");
        System.out.println("Enter 5 for Exit operation");
        System.out.println(" ");
        Scanner s=new Scanner(System.in);
        switch(s.nextInt()){
          case 1: ob.push();
                break;
          case 2: ob.pop();
                break;
          case 3: ob.peek();
                break;
          case 4: ob.display();
                break;
          case 5: System.exit(0);
          default: System.out.println("Wrong choice ");
        }
      }
    }
  }
