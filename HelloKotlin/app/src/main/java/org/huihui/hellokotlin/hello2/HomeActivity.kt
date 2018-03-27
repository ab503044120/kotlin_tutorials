package org.huihui.hellokotlin.hello2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.huihui.hellokotlin.AbsObj

class HomeActivity(str: String) : AppCompatActivity() {
    init {
        var str2 = str
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        object :AbsObj(){
            override fun absclass() {
            }

        }
    }
}