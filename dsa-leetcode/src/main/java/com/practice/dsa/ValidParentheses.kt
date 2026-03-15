package com.practice.dsa


/*

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


 */
fun isValidParentheses(s: String): Boolean {

    var stack = ArrayDeque<Char>()
    var pairs = mapOf(
        ')' to '(',
        '}' to '{',
        ']' to '[',
    )

    for (ch in s){
        if (ch in pairs.values){
            stack.add(ch)
        }else{
            if (stack.isEmpty() || stack.removeLast() != pairs[ch])
                return false
        }
    }
    return stack.isEmpty()

}

//Time complexity is O(n)