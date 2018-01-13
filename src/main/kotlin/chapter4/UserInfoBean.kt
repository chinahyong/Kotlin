package chapter4

class UserInfoBean @JvmOverloads
constructor(var uid: String, var nickname: String? = null,
            var headPic: String) {
    var balance: Long? = null

    fun equals(bean: UserInfoBean): Boolean {
        return uid == bean.uid
    }
}