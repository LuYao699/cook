package com.example.cook

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

//    onCreate()方法是活动创建时调用的生命周期方法
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//    setContentView(R.layout.activity_main)方法，
//    将布局文件 activity_main.xml 与该活动关联起来，即将该布局设置为该活动的界面布局
        setContentView(R.layout.activity_main)

//    findViewById<LinearLayout>(R.id.bottom_navigation)方法，
//    通过 ID 查找底部导航栏容器，并将其存储在 bottomNav 变量中，以便后续操作
        val bottomNav = findViewById<LinearLayout>(R.id.bottom_navigation)

        // 导航项1的点击事件
        val navItem1 = findViewById<TextView>(R.id.nav_item_1)

//    setOnClickListener创建点击事件监听器，当用户点击某个导航项时，相应的点击事件处理逻辑将会被执行
        navItem1.setOnClickListener {
            // 处理导航项1的点击事件逻辑，
            Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show()
        }

        // 导航项2的点击事件
        val navItem2 = findViewById<TextView>(R.id.nav_item_2)
        navItem2.setOnClickListener {
            // 处理导航项2的点击事件逻辑
            Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show()
        }

        // 导航项3的点击事件
        val navItem3 = findViewById<TextView>(R.id.nav_item_3)
        navItem3.setOnClickListener {
            // 处理导航项3的点击事件逻辑
            Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show()
        }

        // 导航项4的点击事件
        val navItem4 = findViewById<TextView>(R.id.nav_item_4)
        navItem4.setOnClickListener {
            // 处理导航项4的点击事件逻辑
            Toast.makeText(this, "Item 4 clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
