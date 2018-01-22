package chapter5

import java.io.BufferedReader
import java.io.FileReader

data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name is working")
    }
}

fun main(args: Array<String>) {
//    var p = findPerson()
//    p?.name
//    findPerson()?.let { (name, age) ->
//        println(name)
//        println(age)
//    }
//
//    findPerson()?.apply {
//        work()
//        println(age)
//        println(name)
//    }
//    with(findPerson()) {
//    }

    BufferedReader(FileReader("hi.txt")).use {
        var line: String
        while (true) {
            line = readLine() ?: break
            println(line)
        }
    }
}

fun findPerson(): Person? {
    return null
}