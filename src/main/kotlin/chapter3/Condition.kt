package chapter3

private const val USERNAME = "kotlin"
private const val PASSWORD = "123456"

fun main(args: Array<String>) {
    println("请输入用户名：")
    var username = readLine()
    println("请输入密码：")
    var password = readLine()
    if (USERNAME==username && PASSWORD == password)
        println("登录成功")
    else
        println("登录失败")

}