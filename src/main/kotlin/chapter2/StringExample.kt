package chapter2

val aString: String = "HelloWorld"
val bString: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))
fun main(args: Array<String>) {
    println(aString == bString)
    println(aString === bString)
    println(bString)

    val arg1: Int = 0
    val arg2: Int = 1
    println("$arg1+$arg2=${arg1 + arg2}")

    val rawString: String = """
        \t
        \n
        """
    println(rawString + rawString.length)
}