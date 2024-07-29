// INPUT: ----------
// Programming

// OUTPUT:---------------
// P         g
//  r       n 
//   o     i  
//    g   m   
//     r m    
// Programming
//     r m    
//    g   m   
//   o     i  
//  r       n 
// P         g

import java.util.*;
class Pattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char ch[]=s.toCharArray();
    int j=0,k=ch.length-1,l=0,n=0;
    for(int i=0;i<ch.length;i++)
    {
      for(int m=0;m<ch.length;m++){
        if(i==ch.length/2)
        {
          System.out.print(ch[n]);
          n++;
        }                

        else if(m==j){
        System.out.print(ch[j]);
        }
        else if(m==k)
        System.out.print(ch[k]);


        else
        System.out.print(" ");
      }
      j++;
      k--;


      System.out.println();


    }
  }
  
}
