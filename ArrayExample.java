import java.util.*;
class ArrayExample{
  public static void main(String[] args)
  {
      int []arr=new int[10];//this is declaration of array in java
      int i=0;
      Scanner s=new Scanner(System.in);//Here we created object of Scanner class
      System.out.println("Insert element: ");
      for(i=0;i<arr.length;i++)
      {
        arr[i]=s.nextInt();//See how we can Insert integer elments in an array
      }
      System.out.println("Inserted element : ");
      for(i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
  }
}
