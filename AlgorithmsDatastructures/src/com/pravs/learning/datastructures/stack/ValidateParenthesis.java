package com.pravs.learning.datastructures.stack;

import java.util.Stack;
/**
 * Created by praveenkumarjv on 5/15/17.
 */
public class ValidateParenthesis {

    public static final char l_bracket = '{';
    public  static final char r_bracket = '}';

    boolean validateParen(String s)
    {
        Stack stack = new Stack();
        for(int i=0; i<s.length(); ++i)
        {
            if(s.charAt(i) == l_bracket)
            {
                stack.push(l_bracket);
            }else if(s.charAt(i) == r_bracket)
            {
                if(stack.isEmpty())
                    return false;
                if(stack.pop() != r_bracket) {
                    return false;
                }
            }
        }
    }
}
