package org.huihui.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = ""
        hello()
        var a = "1122"
        var b = 2
        findViewById<TextView>(R.id.tv)
        object : AbsObj() {
            override fun absclass() {
            }

        }
        var str = StaticClass.str
        var str1 = StaticClass.getStr1()
//        fun StaticClass.Companion.extendFun(): String {
//            return "extendsFun"
//        }
//
//        var extendFun = StaticClass.extendFun()

//        var StaticClass.Companion
    }

    fun hello() {
        var a = "aaa"
        var b = "bbb"
        var c = """$b
            $a""".trimIndent()
        Toast.makeText(this, c, Toast.LENGTH_SHORT).show()

//        Toast.makeText(this, Hello.Hello(), Toast.LENGTH_SHORT).show()

    }
}
