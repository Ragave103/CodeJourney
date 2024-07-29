// Write a program to check whether the string is isogram or not

// Input Format
// Accept the string as input

// Output Format
// ISOGRAM / NOT ISOGRAM

// Sample Input 0
// orange
// Sample Output 0
// ISOGRAM
// Explanation 0
// orange = all char are unique

// Sample Input 1
// test
// Sample Output 1
// NOT ISOGRAM
// Explanation 1
// test = t is repeated , so not isogram

// Sample Input 2
// i like coffe
// Sample Output 2
// NOT ISOGRAM
// Explanation 2
// i like coffe , e is repeated

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt=0;
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    cnt++;
            }
        }
        if(cnt==0)
            System.out.println("ISOGRAM");
        else
            System.out.println("NOT ISOGRAM");
    }
}
