// Given a string "a3b3c2", expand it, = "aaabbbcc" . Given that input string's length is always smaller than output string,

// Input Format
// string

// Output Format
// Expand the string

// Sample Input 0
// a1b2c3
// Sample Output 0
// abbccc

// Sample Input 1
// a2n1p0s3
// Sample Output 1
// aansss

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i+=2)
        {
            int num = Character.getNumericValue(s.charAt(i+1));
            for(int j=0;j<num;j++)
                System.out.print(s.charAt(i));
        }
    }
}
