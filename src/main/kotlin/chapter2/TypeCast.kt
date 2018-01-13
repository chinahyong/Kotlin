package chapter2

fun main(args: Array<String>) {
    var parent: Parent = Child()
    if (parent is Child) {
        println(parent.name)
    }

    var parent2: Parent = Parent()
    var child: Child? = parent2 as? Child
}