package chapter5

data class ListNode(val value: Int, var next: ListNode? = null)

fun main(args: Array<String>) {
    val MAX_NODE_COUNT = 1000000
    var head: ListNode = ListNode(0)
    var p = head
    for (index in 0..MAX_NODE_COUNT) {
        p.next = ListNode(index)
        p = p.next!!
    }

    println(findListNode(head,MAX_NODE_COUNT)?.value)
}

// 尾递归
tailrec fun findListNode(head: ListNode?, value: Int): ListNode? {
    head ?: return null
    if (head.value == value) return head
    return findListNode(head.next, value)
}

// 阶乘，非尾递归
fun factorial(n: Long): Long {
    return n * factorial(n - 1)
}

// 二叉树
data class TreeNode(val value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

// 二叉树查找
fun findTreeNode(node: TreeNode?, value: Int): TreeNode? {
    node ?: return null
    if (node.value == value) return node
    return findTreeNode(node.left, value) ?: return findTreeNode(node.right, value)
}