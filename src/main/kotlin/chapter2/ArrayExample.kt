package chapter2

var intArr: IntArray = intArrayOf(1, 2, 3, 4, 5)
var charArr: CharArray = charArrayOf('a', 'b', 'c', 'd')
var stringArr: Array<String> = arrayOf("dfj", "dfs", "呵呵")

fun main(args: Array<String>) {
    println(intArr)
    println(charArr)
    println(stringArr.size)
    println(String(charArr))
    for (string in stringArr) {
        println(string)
    }
    println("2:" + stringArr[2])
    println(stringArr.joinToString(""))
    println(intArr.slice(0..2))
}