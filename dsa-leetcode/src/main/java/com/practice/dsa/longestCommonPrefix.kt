package com.practice.dsa
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

 */

fun longestCommonPrefix(strs: Array<String>): String {

    var prefixString = ""

    if (strs.isEmpty()) return ""

    prefixString = strs[0]

    for (i in 1 until strs.size){
        while (strs[i].indexOf(prefixString) != 0){
            prefixString = prefixString.substring(0, prefixString.length - 1)
            if (prefixString.isEmpty()) return ""
        }
    }
    return prefixString

}

//Time Complexity O(1)