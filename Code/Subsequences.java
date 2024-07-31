// Enter a string: 
// abc
// Subsequences are :
// abc
// ab
// ac
// a
// bc
// b
// c


import java.util.*;

class Subsequence {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string: ");

    String s = sc.next();

    System.out.println("Subsequences are : ");


    
    
    findSubsequence(s,"");
  }

  public static void findSubsequence(String s,String ans){
    if(s.isEmpty()){
      System.out.println(ans);
      return;
    }

    findSubsequence(s.substring(1), ans+s.charAt(0));
    findSubsequence(s.substring(1), ans);
  }
  
}
