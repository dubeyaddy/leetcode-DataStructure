package com.practice.dsa

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