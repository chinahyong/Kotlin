package chapter2

// boolean 类型
val aBoolear: Boolean = true
val bBoolear: Boolean = false

/**
 * double 64
 * float 32
 * int 32
 * long 64
 * short 16
 * byte 8
 * 不支持隐式转换
 */
val anInt: Int = 1
val anotherInt: Int = 0xFF
val twoInt: Int = 0b0101001
fun main(args: Array<String>) {
    println(anotherInt)
    println(twoInt)
    println("Int max:" + Int.MAX_VALUE)
    println(Math.pow(2.0, 31.0))
    println("Int min:" + Int.MIN_VALUE)
    println(Math.pow(-2.0, 31.0))

    println("Long max:" + Long.MAX_VALUE)
    println("Long mix:" + Long.MIN_VALUE)

    println("Float max:" + Float.MAX_VALUE)
    println("Float min:" + -Float.MAX_VALUE)

    println("Short max:" + Short.MAX_VALUE)
    println("Short min:" + Short.MIN_VALUE)

    println("Byte max:" + Byte.MAX_VALUE)
    println("Byte min:" + Byte.MIN_VALUE)
}
