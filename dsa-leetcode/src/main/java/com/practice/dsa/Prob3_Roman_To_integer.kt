package com.practice.dsa

fun romanToInt(s: String): Int {

    val values = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var total = 0
    var i = 0

    while (i < s.length){
        val current = values[s[i]]!!
        if (i + 1 < s.length){
            val next = values[s[i + 1]]!!
            if (current < next){
                total += (next - current)
                i += 2
                continue
            }
        }
        total += current
        i++
    }

    return total

}