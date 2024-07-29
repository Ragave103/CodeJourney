// Write a program to replace all vowels with spaces
// Input Format
// Accept string as an input

// Output Format

// Print the replaced string

// Sample Input 0
// Replace all vowels
// Sample Output 0
// R pl c   ll v w ls

// Sample Input 1
// DreamDart
// Sample Output 1
// Dr  mD rt

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
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
                c[i]=' ';
        
        for(char ch:c)
            System.out.print(ch);
            
        
    }
}
