// Enter the string: 
// java
// Enter the right rotations: 
// 2
// vaja



import java.util.*;


class Rotation{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String s =sc.next();
    System.out.println("Enter the right rotations: ");
    int rotation=sc.nextInt();
    char temp;


    char ch[] = s.toCharArray();
    for(int i=0;i<rotation;i++){

      temp = ch[ch.length-1];

      for(int j=ch.length-1;j>0;j--)
      {
        ch[j]=ch[j-1];                
      }
      ch[0]=temp;
    }

    System.out.println(String.valueOf(ch));
  }
}
