package Ragave_CodeJourney.Code;
import java.util.*;


// Create a Java program named numberPlate to calculate the sum of digits in a series of license plate numbers. 
// The program accepts space-separated strings as input, where each string consists of alphanumeric characters 
// followed by a hyphen and a numerical component

// Input:

// ABC123-456 XYZ987-654

// Output:

// 30

class numberPlate
{
  public static void main(String[] args)
  {
    int n,sum=0,r;
    String s;
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    String s1[]=s.split(" ");
    for(int i=0;i<s1.length;i++)
    {
      String []s2 = s1[i].split("-");
      n=Integer.parseInt(s2[1]);
      while(n!=0)
      {
        r=n%10;
        sum+=r;
        n=n/10;


      }


    }
    System.out.println(sum);

  }
}