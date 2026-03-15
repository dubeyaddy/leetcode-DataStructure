package com.practice.dsa

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