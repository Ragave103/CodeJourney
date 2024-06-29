// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.
 

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false
 

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.


class Solution {

    static char stack[] = new char[10000];
    static int top=-1;

    public static void push(char ch)
    {
        stack[++top]=ch;

    }

    public static char peek()
    {
        if(isEmpty())
        return '\0';
        return stack[top];
    }

    public static char pop()
    {
        if(isEmpty())
        return '\0';
        return stack[top--];

    }

    public static boolean isEmpty()
    {
        if(top==-1)
        return true;
        return false;
    }

    public boolean isValid(String s) {
        char topch;
        top=-1;

        for(char ch: s.toCharArray())
        {
            if(ch=='('||ch=='['||ch=='{')
            {
                push(ch);
            }
            else{
                if(isEmpty())
                return false;
                topch = peek();
                if((topch=='(' && ch==')')||(topch=='[' && ch==']')||(topch=='{' && ch=='}'))
                {
                    pop();
                }
                else
                {
                    return false;
                }
                
            }
        }

        return isEmpty();
        
    }
}
