package chapter5

fun main(args: Array<String>) {
//    val list = listOf(1, 2, 3, 4, 5, 6)
//
//    var newlist = ArrayList<Int>()
//
//    // 集合映射旧方式
//    list.forEach({
//        val newElement = it * 2 + 3
//        newlist.add(newElement)
//    })
//    newlist.forEach(::println)
//
//    var newlist2 = list.map { it * 2 + 3 }
//    newlist2.forEach(::println)
//
//    // 会有一个临时集合，占用内存
//    val newList3 = list.map(Int::toDouble)
//    newList3.forEach(::println)
    val list = listOf(
            0..20,
            2..11,
            50..200
    )

    val flatList = list.flatMap {
        it
    }
//    flatList.forEach(::println)
    flatList.reduce { acc, i -> acc + i }
//    (0..6).map(::factorial).forEach(::println)

    // reduce 初始值
    (1..200).map(::factorial).foldRight(StringBuilder()) { i, acc ->
        acc.append(i).append(",")
    }
    // 取偶数
    println(flatList.filter { it % 2 == 0 })
    // 取单数下标单数
    println(flatList.filterIndexed({ index, it -> index % 2 == 1 }))
    // 遇到第一个不符合 基数的停止
    println(flatList.takeWhile { it % 2 == 1 })
//    println((0..6).joinToString(","))
}

fun factorial(n: Int): Int {
    if (n == 0) return 1
    return (1..n).reduce { acc, i -> acc * i }
}