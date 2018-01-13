package chapter3

val int2Long = fun(name: String) = "hi:" + name
var intArr: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

fun main(args: Array<String>) {
    println(int2Long("int2Long"))
    intArr.forEach { println(it) }
    intArr.forEach Foreach@ {
        if (it == 3) return@Foreach
        println(it)
    }
}