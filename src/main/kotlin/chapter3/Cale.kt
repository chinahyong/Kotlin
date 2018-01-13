package chapter3

fun main(args: Array<String>) {
    println("请输入一个算数例如：3 + 4")
    var input = readLine()
    if (input != null) {
        var inputArr = input.trim().split(" ")
        var left = inputArr[0].toDouble()
        var op = inputArr[1]
        var right = inputArr[2].toDouble()
        println("${left} ${op} ${right} = ${Operator(op).apply(left, right)}")
    }
}

class Operator(op: String) {
    val opFun: (left: Double, right: Double) -> Double

    init {
        opFun = when (op) {
            "+" -> { left, right -> left + right }
            "-" -> { left, right -> left - right }
            "*" -> { left, right -> left * right }
            "/" -> { left, right -> left / right }
            "%" -> { left, right -> left % right }
            else ->
                throw UnsupportedOperationException(op)
        }
    }

    fun apply(left: Double, right: Double): Double {
        return opFun(left, right)
    }
}