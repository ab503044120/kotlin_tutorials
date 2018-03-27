package org.huihui.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hello()
        var a = "1122"
        var b = 2
        findViewById<TextView>(R.id.tv)
        object :AbsObj(){
            override fun absclass() {
            }

        }
    }

    fun hello() {
        var a = "aaa"
        var b = "bbb"
        var c ="""$b
            $a""".trimIndent()
        Toast.makeText(this, c, Toast.LENGTH_SHORT).show()
//        Toast.makeText(this, Hello.Hello(), Toast.LENGTH_SHORT).show()

    }
}
