package chapter2

var range: IntRange = 0..1024

var rangeExec: IntRange = 0 until 1024

var emptyRange: IntRange = 0..-1

fun main(args: Array<String>) {
    println(emptyRange.isEmpty())
    println(range.contains(50))
    println(50 in range)

    for (i in range) {
        println("$i")
    }
}
