package chapter2

open class Friend(type: String, sex: String, name: String) {
    init {
        println("${name}是一个${type}的${sex}孩子")
    }
}

class GirlFriend : Friend("活泼", "女", "啦啦")
class BoyFriend : Friend("爷们", "男", "超人")

fun main(args: Array<String>) {
    val gf: GirlFriend = GirlFriend()
    val bf: BoyFriend = BoyFriend()
}