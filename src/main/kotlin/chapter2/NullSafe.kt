package chapter2

/**
 * !!   确定部位null
 * ?    如果为null 认为是return.  参数可空，没有？ 参数不可为空
 */
fun getName(): String {
    return " a"
}

fun getName2(): String? {
    return null
}

fun main(args: Array<String>) {
    println(getName().length)
    println(getName2()?.length)
}