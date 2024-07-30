// Enter size: 
// 5
// Enter array values: 
// 10 20 30 40 50
// Enter rotations: 
// 2
// 40 50 10 20 30 

import java.util.*;

class CyclicRotations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size: ");
    int n  =sc.nextInt();

    int arr[]=new int[n];
    System.out.println("Enter array values: ");

    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    System.out.println("Enter rotations: ");
    int rotations = sc.nextInt();
    int temp;

    for(int i=0;i<rotations;i++){
      temp = arr[n-1];
      for(int j=n-1;j>0;j--){

        arr[j]=arr[j-1];
      }
      arr[0]=temp;

    }

    for(int i=0;i<n;i++)
    System.out.print(arr[i]+" ");



  }
  
}
