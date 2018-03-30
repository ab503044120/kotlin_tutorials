package org.huihui.hellokotlin

class StaticClass {
    private var str: String = ""

    companion object {
        val str: String = "1111"

        fun getStr1(): String {
            return "11111111"
        }
    }
}