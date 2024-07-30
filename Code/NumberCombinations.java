// Enter values : 
// 5 6
// Enter limit : 
// 100
// 5 6 55 56 65 66 

import java.util.*;

class Combinations {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter values : ");
    int n1,n2,limit,temp,flag=0;
    n1=sc.nextInt();
    n2=sc.nextInt();
    System.out.println("Enter limit : ");

    limit=sc.nextInt();
    for(int i=1;i<=limit;i++){
      flag=0;
      temp =i;
      while(temp!=0){
        if(temp%10==n1 || temp%10==n2)
        temp/=10;
        else{
          flag=1;
          break;
        }
            
      }

      if(flag ==0)
      System.out.print(i+" ");

    }

  }
  
}
