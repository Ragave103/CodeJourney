// Problem: Given a positive integer n and another positive integer 
// d, determine whether all the digits in n are less than or equal to d.

// Input: The program takes two integers n and d as input from the user.

// Output: Print "yes" if all the digits in n are less than or equal to d, otherwise print "no".
package Ragave_CodeJourney.Code;
import java.util.*;
class Ddigits {
  public static void main(String[] args) {
    int d,n,r,flag=0;
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();
    d=sc.nextInt();
    while(n!=0)
    {
      r=n%10;
      if(r>d)
      {
        flag = 1;
        break;
      }
      n/=10;

    }
    if(flag!=1)
    System.out.println("yes");
    else
    System.out.println("no");

  }
}
