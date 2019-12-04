package com.devyk.customview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.button
import kotlinx.android.synthetic.main.activity_main.button2
import kotlinx.android.synthetic.main.activity_main.button3
import kotlinx.android.synthetic.main.activity_main.button4
import kotlinx.android.synthetic.main.activity_main.button5
import kotlinx.android.synthetic.main.activity_main.button6
import kotlinx.android.synthetic.main.activity_main.button7
import kotlinx.android.synthetic.main.activity_main.button8

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        button.setOnClickListener {
            //绘制圆
            startActivity(Intent(this@MainActivity, TestActivity::class.java))
        }
        button2.setOnClickListener {
            //刮刮卡
            startActivity(Intent(this@MainActivity, TestActivity1::class.java))
        }
        button3.setOnClickListener {
            //冲突
            startActivity(Intent(this@MainActivity, Main3Activity::class.java))
        }
        button4.setOnClickListener {
            //GallaryHorizonalScrollView
            startActivity(Intent(this@MainActivity, Main4Activity::class.java))
        }
        button5.setOnClickListener {
            //表
            startActivity(Intent(this@MainActivity, Main5Activity::class.java))
        }
        button6.setOnClickListener {
            //基础事件
            startActivity(Intent(this@MainActivity, Main6Activity::class.java))
        }
        button7.setOnClickListener {
            //事件拦截
            startActivity(Intent(this@MainActivity, Main7Activity::class.java))
        }
        button8.setOnClickListener {
            //绘制
            startActivity(Intent(this@MainActivity, Main8Activity::class.java))
        }

    }
}
